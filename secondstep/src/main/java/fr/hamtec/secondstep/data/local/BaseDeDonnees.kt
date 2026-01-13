package fr.hamtec.secondstep.data.local

import javax.inject.Inject

class BaseDeDonnees @Inject constructor(private val tablePersonne: TablePersonne) {
    fun afficherDonneesPersonnes() {
        tablePersonne.afficherDonnees()
    }
}