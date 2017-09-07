package br.com.andersoncfsilva.auto_home_android_things.core.log

import timber.log.Timber


object MyLog {

    val tag = "auto-home"

    fun v(msg: String) {
        Timber.tag(tag).v(msg)
    }

    fun v(msg: String, tr: Throwable) {
        Timber.tag(tag).v(msg, tr)
    }

    fun d(msg: String) {
        Timber.tag(tag).d(msg)
    }

    fun d(msg: String, tr: Throwable) {
        Timber.tag(tag).d(msg, tr)
    }

    fun i(msg: String) {
        Timber.tag(tag).i(msg)
    }

    fun i(msg: String, tr: Throwable) {
        Timber.tag(tag).i(msg, tr)
    }

    fun w(msg: String) {
        Timber.tag(tag).w(msg)
    }

    fun w(msg: String, tr: Throwable) {
        Timber.tag(tag).w(msg, tr)
    }

    fun w(tr: Throwable) {
        Timber.tag(tag).w(tr)
    }

    fun e(msg: String, tr: Throwable) {
        Timber.tag(tag).e(msg, tr)
    }

    fun e(tr: Throwable) {
        Timber.tag(tag).e(tr)
    }
}