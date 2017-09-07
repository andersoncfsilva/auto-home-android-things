package br.com.andersoncfsilva.auto_home_android_things

import android.app.Activity
import android.app.Application
import br.com.andersoncfsilva.auto_home_android_things.core.dagger.AppInjector
import br.com.andersoncfsilva.auto_home_android_things.core.log.CrashReportingTree
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import timber.log.Timber
import javax.inject.Inject

class App : Application(), HasActivityInjector {

    @Inject lateinit var activityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        AppInjector.init(this)
        configTimber()
    }

    override fun activityInjector(): AndroidInjector<Activity> {
        return activityInjector
    }

    fun configTimber(){
        Timber.plant(if (!BuildConfig.DEBUG) CrashReportingTree() else Timber.DebugTree())
    }
}
