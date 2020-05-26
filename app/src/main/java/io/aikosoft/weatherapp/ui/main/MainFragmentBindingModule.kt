package io.aikosoft.weatherapp.ui.main

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainFragmentBindingModule {

    @ContributesAndroidInjector
    abstract fun bindMainFragment(): MainFragment
}