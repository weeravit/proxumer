package com.weeravit.proxumer

import android.app.Application
import com.weeravit.proxumer.modules.achievement.data.FakeAchievementDatasource
import com.weeravit.proxumer.modules.achievement.domain.AchievementUsecase
import com.weeravit.proxumer.modules.home.data.FakeBannerDatasource
import com.weeravit.proxumer.modules.home.data.FakeGoalSavingDatasource
import com.weeravit.proxumer.modules.home.domain.BannerUsecase
import com.weeravit.proxumer.modules.home.domain.GoalSavingUsecase
import com.weeravit.proxumer.modules.newgoal.data.FakeNewGoalDatasource
import com.weeravit.proxumer.modules.newgoal.domain.NewGoalUsecase
import com.weeravit.proxumer.modules.profile.data.NetworkProfileDatasource
import com.weeravit.proxumer.modules.profile.domain.ProfileUsecase
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MyApplication)
            modules(module {
                single { FakeAchievementDatasource() }
                single { FakeBannerDatasource() }
                single { FakeGoalSavingDatasource() }
                single { FakeNewGoalDatasource() }
                single { NetworkProfileDatasource() }

                single { AchievementUsecase(get(FakeAchievementDatasource::class)) }
                single { BannerUsecase(get(FakeBannerDatasource::class)) }
                single { GoalSavingUsecase(get(FakeGoalSavingDatasource::class)) }
                single { NewGoalUsecase(get(FakeNewGoalDatasource::class)) }
                single { ProfileUsecase(get(NetworkProfileDatasource::class)) }
            })
        }
    }
}