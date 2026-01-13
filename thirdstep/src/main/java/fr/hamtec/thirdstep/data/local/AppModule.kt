package fr.hamtec.thirdstep.data.local

import android.app.AlertDialog
import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext

@Module
@InstallIn(ActivityComponent::class)
object AppModule {

    @Provides
    fun dialodInfo(@ActivityContext context: Context): AlertDialog{
        return AlertDialog.Builder(context)
            .setTitle("Info")
            .setMessage("Ceci est un message d'information")
            .create()
    }
}