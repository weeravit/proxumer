package com.weeravit.proxumer.modules.newgoal.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weeravit.proxumer.modules.newgoal.data.NewGoalTypeModel
import com.weeravit.proxumer.modules.newgoal.domain.NewGoalUsecase
import kotlinx.coroutines.launch
import org.koin.java.KoinJavaComponent.inject

class NewGoalViewModel : ViewModel() {
    private val newGoalUsecase by inject(NewGoalUsecase::class.java)

    val goalTypeList = MutableLiveData<ArrayList<NewGoalTypeModel>>()

    fun getGoalTypeList() {
        viewModelScope.launch {
            newGoalUsecase.getGoalType().let {
                goalTypeList.postValue(it)
            }
        }
    }
}