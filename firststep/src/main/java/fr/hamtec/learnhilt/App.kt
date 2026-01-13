package fr.hamtec.learnhilt

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

const val TAG = "MYAPP"
@HiltAndroidApp
class App : Application(){
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "[✔] [App.kt] Application créée → Hilt démarre")
    }
}