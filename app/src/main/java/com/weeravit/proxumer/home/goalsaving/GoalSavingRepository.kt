package com.weeravit.proxumer.home.goalsaving

import com.weeravit.proxumer.home.goalsaving.GoalSavingModel

interface GoalSavingRepository {
    suspend fun getGoalSavingList(): ArrayList<GoalSavingModel>
}