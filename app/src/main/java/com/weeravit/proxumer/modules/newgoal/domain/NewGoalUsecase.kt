package com.weeravit.proxumer.modules.newgoal.domain

import com.weeravit.proxumer.modules.newgoal.data.NewGoalRepository

class NewGoalUsecase(private val repository: NewGoalRepository) {
    suspend fun getGoalType() = repository.getGoalType()
}