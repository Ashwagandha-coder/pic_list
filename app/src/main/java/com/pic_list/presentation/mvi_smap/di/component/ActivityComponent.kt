package com.simple.mvi.di.component

import com.simple.mvi.di.annotations.ActivityScope
import com.simple.mvi.di.module.ActivityModule
import dagger.Component

@ActivityScope
@Component(modules = [ActivityModule::class], dependencies = [ApplicationComponent::class])
interface ActivityComponent {
    fun inject(baseActivity: RootBaseActivity)
    fun appRouter(): AppRouter
}