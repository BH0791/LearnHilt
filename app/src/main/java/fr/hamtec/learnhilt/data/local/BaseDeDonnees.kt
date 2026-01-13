package fr.hamtec.learnhilt.data.local

import android.util.Log
import fr.hamtec.learnhilt.TAG
import javax.inject.Inject

class BaseDeDonnees @Inject constructor() {
    val donnees = arrayListOf<String>("Louis", "Fernand", "Jean", "Alain", "Michel")

    fun afficherDonnees(){
        Log.i(TAG, donnees.toString())
    }
}