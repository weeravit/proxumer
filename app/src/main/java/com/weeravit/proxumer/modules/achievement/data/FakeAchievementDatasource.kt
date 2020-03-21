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
                            title = "",
                            imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                        ),
                        AchievementMenuModel(
                            title = "",
                            imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                        ),
                        AchievementMenuModel(
                            title = "",
                            imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                        ),
                        AchievementMenuModel(
                            title = "",
                            imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                        ),
                        AchievementMenuModel(
                            title = "",
                            imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                        ),
                        AchievementMenuModel(
                            title = "",
                            imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                        ),
                        AchievementMenuModel(
                            title = "",
                            imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                        ),
                        AchievementMenuModel(
                            title = "",
                            imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                        )
                    )
                )
            coroutine.resume(achievementModel)
        }
}