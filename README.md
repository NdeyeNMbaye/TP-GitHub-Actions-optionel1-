## CI/CD Pipeline avec GitLab CI


Ce projet a pour objectif la mise en place d’une chaîne d’intégration continue et de déploiement continu (CI/CD) en utilisant GitLab CI.

Le pipeline automatise le cycle de développement et de livraison d’une application via Docker.

###  Objectif du TP

Mettre en place un pipeline CI/CD permettant :

le build automatique du projet
l’exécution des tests
la construction d’une image Docker
le push vers Docker Hub

### Configuration CI/CD

Le pipeline est défini dans le fichier suivant :

<img width="433" height="153" alt="image" src="https://github.com/user-attachments/assets/494733a2-4182-4b38-883e-81ac07a5661f" />

### Étapes du pipeline

Le pipeline GitLab CI exécute les étapes suivantes :

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
