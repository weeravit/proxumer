package com.weeravit.proxumer.modules.home.domain

import com.weeravit.proxumer.modules.home.data.GoalSavingRepository

class GoalSavingUsecase(private val repository: GoalSavingRepository) {
    suspend fun getGoalSavingList() = repository.getGoalSavingList()
}