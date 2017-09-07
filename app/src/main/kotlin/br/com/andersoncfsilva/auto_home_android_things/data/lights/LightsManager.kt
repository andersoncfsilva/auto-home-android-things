package br.com.andersoncfsilva.auto_home_android_things.data.lights

import android.arch.lifecycle.LiveData
import android.util.Log
import br.com.andersoncfsilva.auto_home_android_things.core.log.MyLog
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import javax.inject.Inject

class LightsManager @Inject constructor(val firebase: DatabaseReference) : LiveData<Light>() {

    companion object {
        private val FIREBASE_LIGHTS = "lights"
    }

    private val valueEventListener = object : ValueEventListener {
        override fun onDataChange(snapshot: DataSnapshot) {
            try {
                val light = snapshot.getValue(Light::class.java)
                MyLog.d("onDataChange $light")
                value = light
            }catch (e: Exception){
                MyLog.e(e)
            }
        }

        override fun onCancelled(error: DatabaseError) {
            MyLog.e("onCancelled", error.toException())
        }
    }

    override fun onActive() {
        super.onActive()
        firebase.child(FIREBASE_LIGHTS).addValueEventListener(valueEventListener)
    }

    override fun onInactive() {
        super.onInactive()
        firebase.child(FIREBASE_LIGHTS).removeEventListener(valueEventListener)
    }
}
