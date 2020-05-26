package io.aikosoft.weatherapp.di.modules

import dagger.Module
import dagger.Provides
import io.aikosoft.weatherapp.di.utils.BaseUrl
import io.aikosoft.weatherapp.di.utils.OpenWeatherApiKey
import javax.inject.Singleton

@Module
class AppConstantsModule {

    @get:Provides
    @get:Singleton
    @get:BaseUrl
    val baseUrl: String = "http://api.openweathermap.org/"

    @get:Provides
    @get:Singleton
    @get:OpenWeatherApiKey
    val openWeatherApiKey = "{YOUR_API_KEY}"
}