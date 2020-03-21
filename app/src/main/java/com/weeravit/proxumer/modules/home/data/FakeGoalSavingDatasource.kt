package com.weeravit.proxumer.modules.home.data

import com.weeravit.proxumer.modules.home.data.GoalSavingModel
import com.weeravit.proxumer.modules.home.data.GoalSavingRepository
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class FakeGoalSavingDatasource :
    GoalSavingRepository {
    override suspend fun getGoalSavingList(): ArrayList<GoalSavingModel> =
        suspendCoroutine { coroutine ->
            val goalSavingList = arrayListOf(
                GoalSavingModel(
                    imageGoalType = "",
                    currentSaving = 16500.0,
                    goalSaving = 20000.0,
                    titleSaving = "ไปเที่ยวญี่ปุ่น",
                    feelingSaving = "Good",
                    daysLeft = 45
                ),
                GoalSavingModel(
                    imageGoalType = "",
                    currentSaving = 500.0,
                    goalSaving = 6000.0,
                    titleSaving = "ซื้อกองทุนรวม",
                    feelingSaving = "Unhappy",
                    daysLeft = 20
                ),
                GoalSavingModel(
                    imageGoalType = "",
                    currentSaving = 2000.0,
                    goalSaving = 5000.0,
                    titleSaving = "ไปทะเล",
                    feelingSaving = "Unhappy",
                    daysLeft = 10
                )
            )
            coroutine.resume(goalSavingList)
        }
}