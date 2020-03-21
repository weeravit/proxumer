package com.weeravit.proxumer.modules.newgoal.data

interface NewGoalRepository {
    suspend fun getGoalType(): ArrayList<NewGoalTypeModel>
}