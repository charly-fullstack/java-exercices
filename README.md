# Commandes Git Utilisées

## Initialisation du dépôt
- `git init` : Initialise un dépôt Git dans le répertoire courant.

## Ajout des fichiers
- `git add .` : Ajoute tous les fichiers modifiés au staging area.
- `git add <nom-du-fichier>` : Ajoute un fichier spécifique au staging area.

## Commit
- `git commit -m "message"` : Crée un commit avec le message spécifié.
- `git commit --amend` : Modifie le dernier commit.

## Rebase interactif
- `git rebase -i HEAD~N` : Permet de réécrire l'historique des commits, où `N` est le nombre de commits à examiner.
- `git rebase --continue` : Continue un rebase après avoir modifié un commit.

## Historique
- `git log --oneline` : Affiche l'historique des commits sous forme condensée.
- `git status` : Affiche l'état actuel du dépôt, les fichiers modifiés, les fichiers en attente de commit, etc.

## Gestion des branches
- `git branch` : Liste les branches existantes dans le dépôt.
- `git checkout -b <nom-de-la-branche>` : Crée et bascule vers une nouvelle branche.

## Pousser le fichier vers GitHub
- `git push origin main` : pousse le fichier vers GitHub

# Gestion de Git
# Commandes Git pour résoudre les conflits et gérer les branches
## Cloner un dépôt distant

Pour cloner un dépôt GitHub (ou autre) sur ta machine locale :

git clone https://github.com/nomUtilisateur/java-exercices.git
## Vérifier l'état du dépôt

Pour vérifier l'état des fichiers modifiés dans ton dépôt local (fichiers modifiés, ajoutés, ou en attente de commit) :

git status
## Ajouter des fichiers à l'index (staging area)

Pour ajouter un fichier spécifique (ou tous les fichiers) à l'index pour le commit :

git add src/main/java/Exercice3Heritage.java  # Un fichier spécifique
git add .  # Tous les fichiers modifiés
## Valider (commit) les modifications

Pour valider (commit) les changements ajoutés à l'index avec un message :

git commit -m "Ton message de commit"
## Pousser (push) les modifications vers le dépôt distant

Pour envoyer les commits locaux vers le dépôt distant (sur GitHub) :

git push origin main
## Tirer (pull) les modifications depuis le dépôt distant

Pour récupérer les changements de la branche distante et les fusionner avec ta branche locale :

git pull origin main
## Fusionner (merge) une branche distante avec ta branche locale

Si tu rencontres un conflit lors de la fusion, utilise cette commande pour fusionner les changements de la branche distante dans ta branche locale :

git merge origin/main --no-ff
## Résoudre les conflits de fusion

Lorsque Git détecte un conflit dans un fichier, il marque les sections conflictuelles dans le fichier. Pour résoudre un conflit, ouvre le fichier, choisis quelle version garder, puis enlève les délimiteurs de conflit (<<<<<<<, =======, >>>>>>>).

Après avoir résolu le conflit, ajoute le fichier à l'index avec :

git add src/main/java/Exercice3Heritage.java

Puis valide la fusion avec :

git commit
## Annuler une fusion en cours

Si tu souhaites annuler une fusion avant de la valider (en cas de problème ou si tu changes d'avis) :

git merge --abort
## Utiliser rebase pour réécrire l'historique

Si tu veux rejouer tes commits locaux sur la branche distante, tu peux utiliser rebase au lieu de merge. Cela rend l’historique plus linéaire :

git rebase origin/main

Si des conflits apparaissent, tu peux les résoudre comme pour un merge, puis continuer le rebase avec :

git rebase --continue

Si tu veux annuler le rebase, utilise :

git rebase --abort
## Voir les logs des commits

Pour afficher l'historique des commits dans ta branche :

git log