package com.weeravit.proxumer.modules.achievement.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.api.load
import com.weeravit.proxumer.R
import com.weeravit.proxumer.modules.achievement.data.AchievementMenuModel
import kotlinx.android.synthetic.main.item_achievement.view.*
import java.util.*

class AchievementMenuAdapter(private val items: ArrayList<AchievementMenuModel>) :
    RecyclerView.Adapter<AchievementMenuAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_achievement, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = items.size

    fun update(items: List<AchievementMenuModel>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            val item = items[adapterPosition]
            itemView.apply {
                text_achievement.text = item.title
                img_achievement.load(item.imageUrl)
            }
        }
    }
}