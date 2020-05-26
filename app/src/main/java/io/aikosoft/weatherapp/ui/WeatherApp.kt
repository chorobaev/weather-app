package io.aikosoft.weatherapp.ui

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import io.aikosoft.weatherapp.di.components.DaggerApplicationComponent

class WeatherApp : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        val component = DaggerApplicationComponent.builder()
            .application(this)
            .build()
        component.inject(this)
        return component
    }

    companion object {
        private var instance: WeatherApp? = null

        fun getInstance(): WeatherApp = instance!!
    }
}