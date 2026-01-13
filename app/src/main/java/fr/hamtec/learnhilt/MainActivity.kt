package fr.hamtec.learnhilt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import dagger.hilt.android.AndroidEntryPoint
import fr.hamtec.learnhilt.ui.theme.LearnHiltTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearnHiltTheme {
                Text("Hello Hilt!")
            }
        }
    }
}
