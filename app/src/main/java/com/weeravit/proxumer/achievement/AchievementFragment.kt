package com.weeravit.proxumer.achievement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.weeravit.proxumer.R
import kotlinx.android.synthetic.main.fragment_achievement.*

class AchievementFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_achievement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initInstances()
    }

    private fun initInstances() {
        val achievementModel = AchievementModel(
            level = 2,
            achievementMenu = arrayListOf(
                AchievementMenuModel(
                    title = "",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                AchievementMenuModel(
                    title = "",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                AchievementMenuModel(
                    title = "",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                AchievementMenuModel(
                    title = "",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                AchievementMenuModel(
                    title = "",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                AchievementMenuModel(
                    title = "",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                AchievementMenuModel(
                    title = "",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                ),
                AchievementMenuModel(
                    title = "",
                    imageUrl = "https://cdn.urldecoder.org/assets/images/url-fb.png"
                )
            )
        )

        text_achievement_level.text = getString(R.string.achievement_level, achievementModel.level)

        list_achievement.apply {
            layoutManager = GridLayoutManager(this@AchievementFragment.context, 3)
            adapter = AchievementMenuAdapter(achievementModel.achievementMenu)
        }
    }

    companion object {
        fun newInstance() =
            AchievementFragment()
    }
}
