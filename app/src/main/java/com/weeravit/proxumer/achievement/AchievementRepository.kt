package com.weeravit.proxumer.achievement

interface AchievementRepository {
    suspend fun getAchievement() : AchievementModel
}