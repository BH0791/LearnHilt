# Seconde step
Introduction de la première vraie notion d'injection en chaîne.
````mermaid
flowchart LR
Activity --> BaseDeDonnees --> TablePersonne
````
Tout ça injecté automatiquement par Hilt, sans module, sans configuration supplémentaire.

C’est limpide, progressif, et ça prépare le terrain pour les futures étapes (modules, qualifiers, scopes, ViewModel…).
