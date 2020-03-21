package com.weeravit.proxumer.modules.achievement.data

import com.weeravit.proxumer.modules.achievement.data.AchievementModel

interface AchievementRepository {
    suspend fun getAchievement() : AchievementModel
}