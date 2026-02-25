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