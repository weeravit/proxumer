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
                            imageUrl = "https://i.ibb.co/wdvy1qm/Screen-Shot-2563-03-22-at-02-52-43.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/wdvy1qm/Screen-Shot-2563-03-22-at-02-52-43.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/wdvy1qm/Screen-Shot-2563-03-22-at-02-52-43.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/wdvy1qm/Screen-Shot-2563-03-22-at-02-52-43.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/wdvy1qm/Screen-Shot-2563-03-22-at-02-52-43.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/wdvy1qm/Screen-Shot-2563-03-22-at-02-52-43.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/wdvy1qm/Screen-Shot-2563-03-22-at-02-52-43.png"
                        ),
                        AchievementMenuModel(
                            title = "Achievement",
                            imageUrl = "https://i.ibb.co/wdvy1qm/Screen-Shot-2563-03-22-at-02-52-43.png"
                        )
                    )
                )
            coroutine.resume(achievementModel)
        }
}