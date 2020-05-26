package io.aikosoft.weatherapp.di.utils

import javax.inject.Qualifier

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class WeatherApp

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class BaseUrl

@Qualifier
@MustBeDocumented
@Retention(AnnotationRetention.RUNTIME)
annotation class OpenWeatherApiKey