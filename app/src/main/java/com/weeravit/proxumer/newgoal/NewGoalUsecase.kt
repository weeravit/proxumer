package com.weeravit.proxumer.newgoal

class NewGoalUsecase(private val repository: NewGoalRepository) {
    suspend fun getGoalType() = repository.getGoalType()
}