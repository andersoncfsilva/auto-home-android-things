package br.com.andersoncfsilva.auto_home_android_things.ui.main

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import br.com.andersoncfsilva.auto_home_android_things.data.lights.Light
import com.google.android.things.pio.Gpio
import com.google.android.things.pio.PeripheralManagerService
import javax.inject.Inject

class MainBoardComponents @Inject constructor() : LifecycleObserver {

    companion object {
        val GPIO_RELAY = "BCM19"
    }

    private lateinit var gpioLight: Gpio

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        gpioLight = PeripheralManagerService().openGpio(GPIO_RELAY)
        gpioLight.setDirection(Gpio.DIRECTION_OUT_INITIALLY_LOW)
    }

    fun setLights(light: Light) {
        gpioLight.value = light.on == true
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun onDestroy() {
        gpioLight.close()
    }
}
