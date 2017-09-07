package br.com.andersoncfsilva.auto_home_android_things.core.dagger

import br.com.andersoncfsilva.auto_home_android_things.core.dagger.scope.ActivityScope
import br.com.andersoncfsilva.auto_home_android_things.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AndroidBindingModule {

    @ActivityScope
    @ContributesAndroidInjector
    abstract fun contributeMainActivity(): MainActivity
}
