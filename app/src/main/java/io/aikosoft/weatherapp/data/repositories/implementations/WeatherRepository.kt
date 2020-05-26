package io.aikosoft.weatherapp.data.repositories.implementations

import io.aikosoft.weatherapp.data.network.WeatherClient
import io.aikosoft.weatherapp.data.repositories.IWeatherRepository
import io.aikosoft.weatherapp.di.utils.OpenWeatherApiKey
import io.aikosoft.weatherapp.models.OpenWeather
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class WeatherRepository @Inject constructor(
    private val weatherClient: WeatherClient,
    @OpenWeatherApiKey
    private val openWeatherApiKey: String
) : IWeatherRepository {

    fun getCurrentWetherForCity(city: String): Single<OpenWeather> =
        weatherClient.getCurrentWeather(city, openWeatherApiKey)
}