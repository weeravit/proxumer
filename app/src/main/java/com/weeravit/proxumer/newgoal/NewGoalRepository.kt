package com.weeravit.proxumer.newgoal

interface NewGoalRepository {
    suspend fun getGoalType(): ArrayList<NewGoalTypeModel>
}