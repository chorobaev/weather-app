package io.aikosoft.weatherapp.ui.main

import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.lifecycle.Observer
import io.aikosoft.weatherapp.R
import io.aikosoft.weatherapp.base.BaseFragment
import io.aikosoft.weatherapp.models.OpenWeather
import kotlinx.android.synthetic.main.fragment_weather.*

class MainFragment : BaseFragment() {

    private lateinit var mainViewModel: MainViewModel

    override val layoutRes: Int get() = R.layout.fragment_weather

    override fun onInitViewModel() {
        super.onInitViewModel()

        mainViewModel = getViewModel()
    }

    override fun onObserveViewModel() {
        super.onObserveViewModel()

        mainViewModel.loading.observe(this, Observer {
            card_weather.visibility = if (it != true) VISIBLE else GONE
            progress_circular.visibility = if (it == true) VISIBLE else GONE
        })

        mainViewModel.currentWeather.observe(this, Observer {
            it?.let { onWeatherReceived(it) }
        })
    }

    private fun onWeatherReceived(weather: OpenWeather) {
        tv_city_name.text = weather.name
        tv_temp_value.text = getString(R.string.int_temp, weather.main.temp.toInt())
        tv_pressure_value.text = getString(R.string.int_pressure, weather.main.pressure)
        tv_humidity_value.text = getString(R.string.int_humidity, weather.main.humidity)
    }
}