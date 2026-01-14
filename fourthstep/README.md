# fourtstrep
- Option A — Introduire un ViewModel Hilt.Pour montrer l’injection dans un composant non‑Android.
- Option B — Introduire un Repository + UseCase. Pour montrer une architecture propre.
- Option C — Introduire un module Singleton (ApplicationComponent)
`````mermaid
classDiagram
    direction LR

    class MainActivity {
        +bd: BaseDeDonnees
        +dialog: AlertDialog
        +onCreate()
    }

    class BaseDeDonnees {
        -tablePersonne: TablePersonne
        +afficherDonneesPersonnes()
    }

    class TablePersonne {
        +donnees: List<String>
        +afficherDonnees()
    }

    class AppModule {
        <<module>>
        +dialodInfo(context: Context): AlertDialog
    }

    class AlertDialog

    %% Relations Hilt
    MainActivity --> BaseDeDonnees : @Inject
    MainActivity --> AlertDialog : @Inject (via @Provides)
    BaseDeDonnees --> TablePersonne : @Inject

    %% Module provides
    AppModule ..> AlertDialog : @Provides
`````