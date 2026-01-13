package fr.hamtec.secondstep

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import fr.hamtec.secondstep.data.local.BaseDeDonnees
import fr.hamtec.secondstep.ui.theme.LearnHiltTheme
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject lateinit var bd: BaseDeDonnees

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "[✔] [MainActivity.kt] onCreate())))")
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        bd.afficherDonneesPersonnes()

    }
}
