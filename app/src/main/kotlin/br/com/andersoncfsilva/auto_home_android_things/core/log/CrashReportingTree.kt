package br.com.andersoncfsilva.auto_home_android_things.core.log

import android.util.Log
import com.google.firebase.crash.FirebaseCrash
import timber.log.Timber


class CrashReportingTree : Timber.Tree() {

    override fun log(priority: Int, tag: String, message: String, e: Throwable?) {
        try {

            FirebaseCrash.log(message)

            e?.let {
                if (priority == Log.ERROR) {
                    FirebaseCrash.report(it)
                }
            }

        } catch (e: Exception) {
            Log.e(MyLog.tag, "Erro Log Firebase", e)
        }
    }

}