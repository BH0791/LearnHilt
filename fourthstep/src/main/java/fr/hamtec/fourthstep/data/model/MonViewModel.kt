package fr.hamtec.fourthstep.data.model

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import fr.hamtec.fourthstep.data.local.BaseDeDonnees
import javax.inject.Inject

@HiltViewModel
class MonViewModel @Inject constructor(private val bd: BaseDeDonnees) : ViewModel() {
    fun afficherDonnees() {
        bd.afficherDonneesPersonnes()
    }
}