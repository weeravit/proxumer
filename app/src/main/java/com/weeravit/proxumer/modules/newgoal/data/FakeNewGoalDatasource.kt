package com.weeravit.proxumer.modules.newgoal.data

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class FakeNewGoalDatasource :
    NewGoalRepository {
    override suspend fun getGoalType(): ArrayList<NewGoalTypeModel> =
        suspendCoroutine { coroutine ->
            val newGoalTypeList = arrayListOf(
                NewGoalTypeModel(
                    title = "Travel",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                NewGoalTypeModel(
                    title = "Education",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                NewGoalTypeModel(
                    title = "Invest",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                NewGoalTypeModel(
                    title = "Clothing",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                NewGoalTypeModel(
                    title = "Education",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                )
            )
            coroutine.resume(newGoalTypeList)
        }
}