package com.weeravit.proxumer.modules.achievement.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weeravit.proxumer.modules.achievement.data.AchievementModel
import com.weeravit.proxumer.modules.achievement.data.FakeAchievementDatasource
import com.weeravit.proxumer.modules.achievement.domain.AchievementUsecase
import kotlinx.coroutines.launch

class AchievementViewModel : ViewModel() {
    private val achievementUsecase by lazy {
        AchievementUsecase(
            FakeAchievementDatasource()
        )
    }

    val achievement = MutableLiveData<AchievementModel>()

    fun getAchievement() {
        viewModelScope.launch {
            achievementUsecase.getAchievement().let {
                achievement.postValue(it)
            }
        }
    }
}