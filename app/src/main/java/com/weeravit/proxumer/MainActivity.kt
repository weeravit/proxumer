package com.weeravit.proxumer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.aurelhubert.ahbottomnavigation.AHBottomNavigation
import com.aurelhubert.ahbottomnavigation.AHBottomNavigationItem
import com.ncapdevi.fragnav.FragNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), FragNavController.RootFragmentListener {

    private val fragNavController by lazy {
        FragNavController(supportFragmentManager, R.id.container)
    }

    private val fragments by lazy {
        listOf(
            HomeFragment.newInstance(),
            WalletFragment.newInstance(),
            AchievementFragment.newInstance(),
            ProfileFragment.newInstance()
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragments()
        initBottomNavigation()
    }

    private fun initFragments() {
        fragNavController.apply {
            rootFragments = fragments
            initialize(FragNavController.TAB1)
        }
    }

    private fun initBottomNavigation() {
        val homeTab =
            AHBottomNavigationItem(R.string.home_tab, R.drawable.ic_home, R.color.inactive_tab)
        val walletTab =
            AHBottomNavigationItem(
                R.string.wallet_tab,
                R.drawable.ic_credit_card,
                R.color.inactive_tab
            )
        val achievementTab =
            AHBottomNavigationItem(
                R.string.achievement_tab,
                R.drawable.ic_stars,
                R.color.inactive_tab
            )
        val profileTab =
            AHBottomNavigationItem(
                R.string.profile_tab,
                R.drawable.ic_account_circle,
                R.color.inactive_tab
            )

        bottom_navigation.apply {
            addItems(listOf(homeTab, walletTab, achievementTab, profileTab))
            accentColor = ContextCompat.getColor(this@MainActivity, R.color.active_tab)
            inactiveColor = ContextCompat.getColor(this@MainActivity, R.color.inactive_tab)
            isForceTint = true
            titleState = AHBottomNavigation.TitleState.ALWAYS_HIDE
            setNotification("1", 3)

            setOnTabSelectedListener { position, _ ->
                fragNavController.switchTab(position)
                true
            }
        }
    }

    override val numberOfRootFragments: Int
        get() = fragments.size

    override fun getRootFragment(index: Int) = fragments[index]
}
