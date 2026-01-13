package fr.hamtec.thirdstep.data.local

import android.util.Log
import fr.hamtec.thirdstep.TAG
import javax.inject.Inject

class TablePersonne @Inject constructor() {
    val donnees = arrayListOf<String>("Louis", "Fernand", "Jean", "Alain", "Michel")

    fun afficherDonnees() {
        Log.i(TAG, donnees.toString())
    }
}