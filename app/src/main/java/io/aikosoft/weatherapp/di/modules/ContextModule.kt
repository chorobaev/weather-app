package io.aikosoft.weatherapp.di.modules

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
interface ContextModule {

    @Binds
    fun bindContext(application: Application): Context
}