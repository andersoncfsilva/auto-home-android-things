package br.com.andersoncfsilva.auto_home_android_things.core.dagger

import br.com.andersoncfsilva.auto_home_android_things.App

object AppInjector {

    fun init(app: App) {
        DaggerAppComponent.builder()
                .appModule(AppModule())
                .build()
                .inject(app)
    }
}
