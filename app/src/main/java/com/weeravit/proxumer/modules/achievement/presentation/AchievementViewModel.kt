package com.weeravit.proxumer.modules.achievement.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weeravit.proxumer.modules.achievement.data.AchievementModel
import com.weeravit.proxumer.modules.achievement.domain.AchievementUsecase
import kotlinx.coroutines.launch
import org.koin.java.KoinJavaComponent.inject

class AchievementViewModel : ViewModel() {
    private val achievementUsecase by inject(AchievementUsecase::class.java)

    val achievement = MutableLiveData<AchievementModel>()

    fun getAchievement() {
        viewModelScope.launch {
            achievementUsecase.getAchievement().let {
                achievement.postValue(it)
            }
        }
    }
}