package io.aikosoft.weatherapp.ui.main

import android.view.Menu
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import io.aikosoft.weatherapp.R
import io.aikosoft.weatherapp.base.BaseActivity

class MainActivity : BaseActivity() {

    private lateinit var mainViewModel: MainViewModel

    override val layoutRes: Int get() = R.layout.activity_main

    override fun onInitViewModel() {
        mainViewModel = getViewModel()
        mainViewModel.fetchCurrentWeatherForCity("Bishkek")
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        menu?.findItem(R.id.mi_search)?.also { menuItem ->
            val searchView = menuItem.actionView as SearchView

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    if (validateCityName(query)) {
                        mainViewModel.fetchCurrentWeatherForCity(query!!)
                    }
                    return false
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    return false
                }
            })

            searchView.setOnCloseListener {
                false
            }
        }

        return true
    }

    private fun validateCityName(city: String?): Boolean {
        if (city == null || city.length < 2 || !city.matches(Regex("[A-Za-z]+"))) {
            Toast.makeText(this, "Invalid city name", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }
}
