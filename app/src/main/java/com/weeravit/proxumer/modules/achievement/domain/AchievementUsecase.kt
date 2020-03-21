package com.weeravit.proxumer.modules.achievement.domain

import com.weeravit.proxumer.modules.achievement.data.AchievementRepository

class AchievementUsecase(private val repository: AchievementRepository) {
    suspend fun getAchievement() = repository.getAchievement()
}