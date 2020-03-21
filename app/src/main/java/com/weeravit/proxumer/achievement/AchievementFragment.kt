package com.weeravit.proxumer.achievement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import com.weeravit.proxumer.R
import com.weeravit.proxumer.utils.EqualSpacingItemDecoration
import kotlinx.android.synthetic.main.fragment_achievement.*

class AchievementFragment : Fragment() {
    private val achievementViewModel by viewModels<AchievementViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_achievement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewModel()
    }

    private fun initViewModel() {
        achievementViewModel.apply {
            achievement.observe(viewLifecycleOwner, Observer {
                text_achievement_level.text = getString(R.string.achievement_level, it.level)

                list_achievement.apply {
                    layoutManager = GridLayoutManager(this@AchievementFragment.context, 3)
                    addItemDecoration(
                        EqualSpacingItemDecoration(
                            context = context,
                            dimenRes = R.dimen.spacing_medium,
                            displayMode = EqualSpacingItemDecoration.GRID
                        )
                    )
                    adapter = AchievementMenuAdapter(it.achievementMenu)
                }
            })

            getAchievement()
        }
    }

    companion object {
        fun newInstance() =
            AchievementFragment()
    }
}
