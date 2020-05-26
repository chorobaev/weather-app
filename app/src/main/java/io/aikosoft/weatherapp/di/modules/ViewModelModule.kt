package io.aikosoft.weatherapp.di.modules

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import io.aikosoft.weatherapp.base.CommonViewModel
import io.aikosoft.weatherapp.base.ViewModelFactory
import io.aikosoft.weatherapp.ui.main.MainViewModel
import io.jachoteam.taxiappclient.di.util.ViewModelKey

@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CommonViewModel::class)
    fun bindCommonViewModel(commonViewModel: CommonViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}