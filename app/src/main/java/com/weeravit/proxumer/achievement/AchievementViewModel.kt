package com.weeravit.proxumer.achievement

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AchievementViewModel : ViewModel() {
    private val achievementUsecase by lazy { AchievementUsecase(FakeAchievementDatasource()) }

    val achievement = MutableLiveData<AchievementModel>()

    fun getAchievement() {
        viewModelScope.launch {
            achievementUsecase.getAchievement().let {
                achievement.postValue(it)
            }
        }
    }
}