package com.weeravit.proxumer.modules.home.presentation

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.weeravit.proxumer.R
import com.weeravit.proxumer.modules.newgoal.presentation.NewGoalActivity
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    private val homeViewModel by viewModels<HomeViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initInstances()
        initViewModel()
    }

    private fun initInstances() {
        ViewCompat.setNestedScrollingEnabled(nested_scroll_view, true)

        button_new_goal.setOnClickListener {
            startActivity(Intent(context, NewGoalActivity::class.java))
        }
    }

    private fun initViewModel() {
        homeViewModel.apply {
            goalSavingList.observe(viewLifecycleOwner, Observer {
                goal_saving_layout.setGoalSaving(it)
            })

            bannerList.observe(viewLifecycleOwner, Observer {
                best_offer_layout.setBanner(it[0])
                suggest_for_you_layout.setBanner(it[1])
            })

            getGoalSavingList()
            getBannerList()
        }
    }

    companion object {
        fun newInstance() =
            HomeFragment()
    }
}
