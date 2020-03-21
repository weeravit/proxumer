package com.weeravit.proxumer.home.goalsaving

class GoalSavingUsecase(private val repository: GoalSavingRepository) {
    suspend fun getGoalSavingList() = repository.getGoalSavingList()
}