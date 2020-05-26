package io.aikosoft.weatherapp.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.aikosoft.weatherapp.ui.main.MainActivity
import io.aikosoft.weatherapp.ui.main.MainFragmentBindingModule

@Module
interface ActivityBindingModule {

    @ContributesAndroidInjector(modules = [MainFragmentBindingModule::class])
    fun bindMainActivity(): MainActivity
}