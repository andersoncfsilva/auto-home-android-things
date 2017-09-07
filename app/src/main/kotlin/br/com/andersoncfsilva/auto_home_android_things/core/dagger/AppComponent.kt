package br.com.andersoncfsilva.auto_home_android_things.core.dagger

import br.com.andersoncfsilva.auto_home_android_things.App
import br.com.andersoncfsilva.auto_home_android_things.core.dagger.scope.AppScope
import dagger.Component
import dagger.android.AndroidInjectionModule

@AppScope
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        AppModule::class,
        AndroidBindingModule::class)
)
interface AppComponent {
    fun inject(app: App)
}
