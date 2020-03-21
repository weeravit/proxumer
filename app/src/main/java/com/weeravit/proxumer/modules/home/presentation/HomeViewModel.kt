package com.weeravit.proxumer.modules.home.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weeravit.proxumer.modules.home.data.BannerModel
import com.weeravit.proxumer.modules.home.data.GoalSavingModel
import com.weeravit.proxumer.modules.home.domain.BannerUsecase
import com.weeravit.proxumer.modules.home.domain.GoalSavingUsecase
import kotlinx.coroutines.launch
import org.koin.java.KoinJavaComponent.inject

class HomeViewModel : ViewModel() {
    private val goalSavingUsecase by inject(GoalSavingUsecase::class.java)
    private val bannerUsecase by inject(BannerUsecase::class.java)

    val goalSavingList = MutableLiveData<ArrayList<GoalSavingModel>>()
    val bannerList = MutableLiveData<ArrayList<BannerModel>>()

    fun getGoalSavingList() {
        viewModelScope.launch {
            goalSavingUsecase.getGoalSavingList().let {
                goalSavingList.postValue(it)
            }
        }
    }

    fun getBannerList() {
        viewModelScope.launch {
            bannerUsecase.getBannerList().let {
                bannerList.postValue(it)
            }
        }
    }
}