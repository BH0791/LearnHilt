package fr.hamtec.fourthstep

import android.app.AlertDialog
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dagger.hilt.android.AndroidEntryPoint
import fr.hamtec.fourthstep.data.local.BaseDeDonnees
import fr.hamtec.fourthstep.data.local.DialogErreur
import fr.hamtec.fourthstep.data.local.DialogInfo
import fr.hamtec.fourthstep.ui.theme.LearnHiltTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject lateinit var bd: BaseDeDonnees
    @Inject
    @DialogInfo
    lateinit var dialogInfo: AlertDialog
    @Inject
    @DialogErreur
    lateinit var dialogErreur: AlertDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "[✔] [MainActivity.kt] onCreate(4)")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        bd.afficherDonneesPersonnes()

        setContent {
            Log.i(TAG, "[✔] [MainActivity] setContent() ")
            LearnHiltTheme  {

                Surface(modifier = Modifier.padding(top = 50.dp, start = 15.dp, end = 15.dp)) {
                    Column() {
                        Button(onClick = {dialogInfo.show()} ) {
                            Text(text = "Information")
                        }
                        Button(onClick = {dialogErreur.show()} ) {
                            Text(text = "Erreur")
                        }

                    }
                }
            }
        }
    }
}