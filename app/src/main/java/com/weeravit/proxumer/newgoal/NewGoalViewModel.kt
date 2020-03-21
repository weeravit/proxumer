package com.weeravit.proxumer.newgoal

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class NewGoalViewModel : ViewModel() {
    private val newGoalUsecase by lazy { NewGoalUsecase(FakeNewGoalDatasource()) }

    val goalTypeList = MutableLiveData<ArrayList<NewGoalTypeModel>>()

    fun getGoalTypeList() {
        viewModelScope.launch {
            newGoalUsecase.getGoalType().let {
                goalTypeList.postValue(it)
            }
        }
    }
}