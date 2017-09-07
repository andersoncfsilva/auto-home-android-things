package br.com.andersoncfsilva.auto_home_android_things.ui.main

import android.arch.lifecycle.ViewModel
import br.com.andersoncfsilva.auto_home_android_things.data.lights.LightsManager
import javax.inject.Inject

class MainViewModel @Inject constructor(val lightsManager: LightsManager) : ViewModel()
