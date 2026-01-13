# FirstStep

1. Un seul point d’entrée : App.kt
   Tu vois immédiatement où Hilt démarre.
   Pas de magie noire.

2. Une classe injectable simple
   Pas de dépendances, pas de modules, pas de qualifiers.
   Juste : @Inject constructor() → Hilt sait créer l’objet.

3. Une Activity qui reçoit l’injection
   Tu vois le lien direct entre le graphe Hilt et ton composant Android.

4. Un log concret
   Tu observes le pipeline en action.

