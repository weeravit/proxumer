package com.weeravit.proxumer.achievement

class AchievementUsecase(private val repository: AchievementRepository) {
    suspend fun getAchievement() = repository.getAchievement()
}