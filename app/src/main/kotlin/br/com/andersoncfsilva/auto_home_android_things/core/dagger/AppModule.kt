package br.com.andersoncfsilva.auto_home_android_things.core.dagger

import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import br.com.andersoncfsilva.auto_home_android_things.core.dagger.scope.AppScope
import br.com.andersoncfsilva.auto_home_android_things.core.dagger.viewmodel.ViewModelModule
import dagger.Module
import dagger.Provides

@Module(includes = arrayOf(ViewModelModule::class))
class AppModule {

    @AppScope @Provides fun provideDatabaseReference(): DatabaseReference {
        return FirebaseDatabase.getInstance().reference!!
    }
}
