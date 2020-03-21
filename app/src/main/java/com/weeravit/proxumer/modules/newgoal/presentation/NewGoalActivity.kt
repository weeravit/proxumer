package com.weeravit.proxumer.modules.newgoal.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.weeravit.proxumer.R
import com.weeravit.proxumer.common.GridItemDecoration
import kotlinx.android.synthetic.main.activity_new_goal.*

class NewGoalActivity : AppCompatActivity() {
    private val newGoalViewModel by viewModels<NewGoalViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_goal)
        initViewModel()
    }

    private fun initViewModel() {
        newGoalViewModel.apply {
            goalTypeList.observe(this@NewGoalActivity, Observer {
                list_new_goal_type.apply {
                    layoutManager = GridLayoutManager(this@NewGoalActivity, 3)
                    addItemDecoration(
                        GridItemDecoration(
                            context = this@NewGoalActivity,
                            itemOffsetId = R.dimen.spacing_small
                        )
                    )
                    adapter =
                        NewGoalTypeAdapter(
                            it
                        )
                }
            })

            getGoalTypeList()
        }
    }
}
