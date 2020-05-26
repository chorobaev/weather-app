package io.aikosoft.weatherapp.di.modules

import dagger.Binds
import dagger.Module
import io.aikosoft.weatherapp.data.repositories.IWeatherRepository
import io.aikosoft.weatherapp.data.repositories.implementations.WeatherRepository

@Module
interface RepositoryModule {

    @Binds
    fun providesSampleRepository(impl: WeatherRepository): IWeatherRepository
}