package com.weeravit.proxumer.modules.achievement.data

import com.weeravit.proxumer.modules.achievement.data.AchievementMenuModel
import com.weeravit.proxumer.modules.achievement.data.AchievementModel
import com.weeravit.proxumer.modules.achievement.data.AchievementRepository
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class FakeAchievementDatasource :
    AchievementRepository {
    override suspend fun getAchievement(): AchievementModel =
        suspendCoroutine { coroutine ->
            val achievementModel =
                AchievementModel(
                    level = 2,
                    achievementMenu = arrayListOf(
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/7R3wZ4Q/Screen-Shot-2563-03-22-at-03-32-57.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/7R3wZ4Q/Screen-Shot-2563-03-22-at-03-32-57.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/7R3wZ4Q/Screen-Shot-2563-03-22-at-03-32-57.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/7R3wZ4Q/Screen-Shot-2563-03-22-at-03-32-57.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/7R3wZ4Q/Screen-Shot-2563-03-22-at-03-32-57.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/7R3wZ4Q/Screen-Shot-2563-03-22-at-03-32-57.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/7R3wZ4Q/Screen-Shot-2563-03-22-at-03-32-57.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/7R3wZ4Q/Screen-Shot-2563-03-22-at-03-32-57.png"
                        )
                    )
                )
            coroutine.resume(achievementModel)
        }
}