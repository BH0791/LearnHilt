package fr.hamtec.fourthstep.data.local

import android.util.Log
import fr.hamtec.fourthstep.TAG
import javax.inject.Inject

class TablePersonne @Inject constructor() {
    val donnees = arrayListOf<String>("Louis", "Fernand", "Jean", "Alain", "Michel")

    fun afficherDonnees() {
        Log.i(TAG, donnees.toString())
    }
}