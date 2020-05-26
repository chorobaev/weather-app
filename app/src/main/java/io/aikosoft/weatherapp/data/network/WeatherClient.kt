package io.aikosoft.weatherapp.data.network

import io.aikosoft.weatherapp.models.OpenWeather
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherClient {

    @GET("/data/2.5/weather?units=metric")
    fun getCurrentWeather(
        @Query("q") city: String,
        @Query("appid") appKey: String
    ): Single<OpenWeather>
}