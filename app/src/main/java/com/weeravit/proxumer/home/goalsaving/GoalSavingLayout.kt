package com.weeravit.proxumer.home.goalsaving

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.weeravit.proxumer.R
import com.weeravit.proxumer.utils.LinearSpacesItemDecoration
import kotlinx.android.synthetic.main.layout_goal_saving.view.*

class GoalSavingLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0,
    defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyle, defStyleRes) {
    init {
        LayoutInflater.from(context)
            .inflate(R.layout.layout_goal_saving, this, true)
        list_goal_saving.apply {
            addItemDecoration(
                LinearSpacesItemDecoration(
                    context = context,
                    dimenRes = R.dimen.spacing_medium
                )
            )
            adapter = GoalSavingAdapter(arrayListOf())
        }
    }

    fun setGoalSaving(items: ArrayList<GoalSavingModel>) {
        val totalCurrentSaving = items.sumByDouble { it.currentSaving }
        val adapter = list_goal_saving.adapter as GoalSavingAdapter

        text_total_goal.text = context.getString(R.string.goal_saving_total, items.size)
        text_current_saving.text = "$totalCurrentSaving"
        adapter.update(items)
    }
}