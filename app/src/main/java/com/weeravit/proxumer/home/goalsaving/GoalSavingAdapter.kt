package com.weeravit.proxumer.home.goalsaving

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.weeravit.proxumer.R
import kotlinx.android.synthetic.main.item_goal_saving.view.*

class GoalSavingAdapter(private val items: ArrayList<GoalSavingModel>) :
    RecyclerView.Adapter<GoalSavingAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_goal_saving, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = items.size

    fun update(items: List<GoalSavingModel>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            val item = items[adapterPosition]
            itemView.apply {
                text_current_saving.text = "${item.currentSaving}"
                text_goal_saving.text = "${item.goalSaving}"
                progress_saving.progress = 50
                text_title_saving.text = item.titleSaving
                text_feeling_saving.text = item.feelingSaving
                text_days_left_saving.text =
                    context.getString(R.string.goal_saving_days_left, item.daysLeft)
            }
        }
    }
}