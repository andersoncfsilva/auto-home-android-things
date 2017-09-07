package br.com.andersoncfsilva.auto_home_android_things.data.lights

data class Light(val on: Boolean? = null){
    override fun toString(): String {
        return "Light(on=$on)"
    }
}
