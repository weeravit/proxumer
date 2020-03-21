package com.weeravit.proxumer.modules.home.data

interface GoalSavingRepository {
    suspend fun getGoalSavingList(): ArrayList<GoalSavingModel>
}