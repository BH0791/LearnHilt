package fr.hamtec.thirdstep

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import fr.hamtec.thirdstep.data.local.BaseDeDonnees
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject lateinit var bd: BaseDeDonnees
    @Inject lateinit var dialog: AlertDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "[✔] [MainActivity.kt] onCreate()")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        bd.afficherDonneesPersonnes()
        dialog.show()
    }
}