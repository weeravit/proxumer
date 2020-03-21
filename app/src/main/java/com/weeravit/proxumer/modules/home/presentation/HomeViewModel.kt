package com.weeravit.proxumer.modules.home.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weeravit.proxumer.modules.home.data.BannerModel
import com.weeravit.proxumer.modules.home.domain.BannerUsecase
import com.weeravit.proxumer.modules.home.data.FakeBannerDatasource
import com.weeravit.proxumer.modules.home.data.FakeGoalSavingDatasource
import com.weeravit.proxumer.modules.home.data.GoalSavingModel
import com.weeravit.proxumer.modules.home.domain.GoalSavingUsecase
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val goalSavingUsecase by lazy {
        GoalSavingUsecase(
            FakeGoalSavingDatasource()
        )
    }
    private val bannerUsecase by lazy {
        BannerUsecase(
            FakeBannerDatasource()
        )
    }

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