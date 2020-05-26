package io.aikosoft.weatherapp.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import io.aikosoft.weatherapp.base.BaseViewModel
import io.aikosoft.weatherapp.data.repositories.implementations.WeatherRepository
import io.aikosoft.weatherapp.models.OpenWeather
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository
) : BaseViewModel() {

    private val _currentWeather = MutableLiveData<OpenWeather>()

    val currentWeather: LiveData<OpenWeather> get() = _currentWeather

    fun fetchCurrentWeatherForCity(city: String) {
        weatherRepository.getCurrentWetherForCity(city).request {
            _currentWeather.value = it
        }
    }
}