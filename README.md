## Github action

Ce projet met en place une chaîne d’intégration continue et de déploiement continu (CI/CD) en utilisant GitHub Actions.

Le pipeline automatise le cycle de développement et de livraison d’une application conteneurisée via Docker.

###  Objectif du TP

Mise en place d’un pipeline CI/CD permettant :

le build automatique du projet
l’exécution des tests
la construction d’une image Docker
le push vers Docker Hub

### Configuration 

Le pipeline est défini dans le fichier suivant :

<img width="433" height="153" alt="image" src="https://github.com/user-attachments/assets/494733a2-4182-4b38-883e-81ac07a5661f" />

### Étapes du pipeline

Le pipeline GITHUB ACTION exécute les étapes suivantes :

Récupération du code source
Build avec Maven
Exécution des tests
Construction de l’image Docker
Login Docker Hub
Push de l’image Docker

### Pipeline exécuté

Le pipeline s’exécute automatiquement à chaque push sur le repository GitLab.

 #### Résultat :

Build succeeded
Tests passed
Docker image pushed successfully

<img width="1600" height="794" alt="image" src="https://github.com/user-attachments/assets/95abea0f-61e3-420a-a6d5-76c01c91ee03" />

<img width="1600" height="806" alt="image" src="https://github.com/user-attachments/assets/264bc639-40d3-476e-9660-98072de2cb63" />

<img width="1600" height="841" alt="image" src="https://github.com/user-attachments/assets/eee1934a-7712-4682-9973-971434ac7fa6" />


<img width="1919" height="969" alt="image" src="https://github.com/user-attachments/assets/95dd2f05-a0c4-432e-a2b8-3b95206128d7" />

<img width="1917" height="886" alt="image" src="https://github.com/user-attachments/assets/3a884abe-78eb-4575-bc62-321d18272e43" />


Ce workflow est déclenché automatiquement à chaque push sur la branche main.

