# fourtstrep
`````mermaid
classDiagram
    direction TB

    class MainActivity {
        +monViewModel: MonViewModel
        +dialogInfo: AlertDialog
        +dialogErreur: AlertDialog
        +onCreate()
    }

    class MonViewModel {
        -bd: BaseDeDonnees
        +afficherDonnees()
    }

    class BaseDeDonnees {
        -tablePersonne: TablePersonne
        +afficherDonneesPersonnes()
    }

    class TablePersonne {
        -donnees: ArrayList<String>
        +afficherDonnees()
    }

    class AppModule {
        <<module>>
        +dialodInfo(context: Context): AlertDialog
        +dialogErreur(context: Context): AlertDialog
    }

    class DialogInfo {
        <<Qualifier>>
    }

    class DialogErreur {
        <<Qualifier>>
    }

    %% Relations
    MainActivity --> MonViewModel : viewModels()
    MainActivity --> AlertDialog : @DialogInfo
    MainActivity --> AlertDialog : @DialogErreur

    MonViewModel --> BaseDeDonnees : @Inject
    BaseDeDonnees --> TablePersonne : @Inject

    AppModule --> AlertDialog : @Provides
    DialogInfo <.. AppModule
    DialogErreur <.. AppModule
`````