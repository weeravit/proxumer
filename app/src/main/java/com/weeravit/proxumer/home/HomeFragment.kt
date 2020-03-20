package com.weeravit.proxumer.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.weeravit.proxumer.R
import com.weeravit.proxumer.home.banner.BannerModel
import com.weeravit.proxumer.home.goalsaving.GoalSavingModel
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initInstances()
    }

    private fun initInstances() {
        val goalSavingList = arrayListOf(
            GoalSavingModel(
                imageGoalType = "",
                currentSaving = 20000.0,
                goalSaving = 16500.0,
                titleSaving = "ไปเที่ยวญี่ปุ่น",
                feelingSaving = "Good",
                daysLeft = 45
            ),
            GoalSavingModel(
                imageGoalType = "",
                currentSaving = 500.0,
                goalSaving = 6000.0,
                titleSaving = "ซื้อกองทุนรวม",
                feelingSaving = "Unhappy",
                daysLeft = 20
            ),
            GoalSavingModel(
                imageGoalType = "",
                currentSaving = 2000.0,
                goalSaving = 5000.0,
                titleSaving = "ไปทะเล",
                feelingSaving = "Unhappy",
                daysLeft = 10
            )
        )
        val bestOfferBanner = BannerModel(
            title = "Best Offer",
            images = arrayListOf(
                "https://cdn.urldecoder.org/assets/images/url-fb.png",
                "https://cdn.urldecoder.org/assets/images/url-fb.png",
                "https://cdn.urldecoder.org/assets/images/url-fb.png",
                "https://cdn.urldecoder.org/assets/images/url-fb.png"
            )
        )
        val suggestForYou = BannerModel(
            title = "Suggest for you",
            images = arrayListOf(
                "https://cdn.urldecoder.org/assets/images/url-fb.png",
                "https://cdn.urldecoder.org/assets/images/url-fb.png",
                "https://cdn.urldecoder.org/assets/images/url-fb.png",
                "https://cdn.urldecoder.org/assets/images/url-fb.png"
            )
        )

        goal_saving_layout.setGoalSaving(goalSavingList)
        best_offer_layout.setBanner(bestOfferBanner)
        suggest_for_you_layout.setBanner(suggestForYou)
    }

    companion object {
        fun newInstance() =
            HomeFragment()
    }
}
