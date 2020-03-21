package com.weeravit.proxumer.newgoal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.weeravit.proxumer.R
import kotlinx.android.synthetic.main.item_new_goal_type.view.*
import java.util.*

class NewGoalTypeAdapter(private val items: ArrayList<NewGoalTypeModel>) :
    RecyclerView.Adapter<NewGoalTypeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_new_goal_type, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = items.size

    fun update(items: List<NewGoalTypeModel>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            val item = items[adapterPosition]
            itemView.apply {
                text_new_goal_type.text = item.title
                img_new_goal_type.load(item.imageUrl)
            }
        }
    }
}