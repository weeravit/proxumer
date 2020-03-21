package com.weeravit.proxumer.modules.home.data

data class GoalSavingModel(
    val imageGoalType: String,
    val currentSaving: Double,
    val goalSaving: Double,
    val titleSaving: String,
    val feelingSaving: String,
    val daysLeft: Int
) {
    val savingProgress: Int
        get() = (currentSaving / goalSaving * 100).toInt()
}