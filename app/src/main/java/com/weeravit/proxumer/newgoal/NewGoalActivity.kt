package com.weeravit.proxumer.newgoal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.weeravit.proxumer.R
import kotlinx.android.synthetic.main.activity_new_goal.*

class NewGoalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_goal)
        initInstances()
    }

    private fun initInstances() {
        val newGoalTypeList = arrayListOf(
            NewGoalTypeModel(
                title = "Travel",
                imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
            ),
            NewGoalTypeModel(
                title = "Education",
                imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
            ),
            NewGoalTypeModel(
                title = "Invest",
                imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
            ),
            NewGoalTypeModel(
                title = "Clothing",
                imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
            ),
            NewGoalTypeModel(
                title = "Education",
                imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
            )
        )

        list_new_goal_type.apply {
            layoutManager = GridLayoutManager(this@NewGoalActivity, 3)
            adapter = NewGoalTypeAdapter(newGoalTypeList)
        }
    }
}
