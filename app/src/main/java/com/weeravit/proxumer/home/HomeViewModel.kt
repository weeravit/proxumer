package com.weeravit.proxumer.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weeravit.proxumer.home.banner.BannerModel
import com.weeravit.proxumer.home.banner.BannerUsecase
import com.weeravit.proxumer.home.banner.FakeBannerDatasource
import com.weeravit.proxumer.home.goalsaving.FakeGoalSavingDatasource
import com.weeravit.proxumer.home.goalsaving.GoalSavingModel
import com.weeravit.proxumer.home.goalsaving.GoalSavingUsecase
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {
    private val goalSavingUsecase by lazy { GoalSavingUsecase(FakeGoalSavingDatasource()) }
    private val bannerUsecase by lazy { BannerUsecase(FakeBannerDatasource()) }

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