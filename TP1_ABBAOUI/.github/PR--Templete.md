# 📄 Pull Request Template

## 📋 Description

<!-- Décrivez brièvement les modifications apportées par cette Pull Request. Expliquez le "Pourquoi" et le "Quoi". -->
- **Problème résolu** : Fix #<Numéro de l'issue liée>  
  Exemple : Correction du calcul de la distance euclidienne entre les mots de passe et les centres de clusters.
- **Nouvelle fonctionnalité ajoutée** : Ajout d'un algorithme de vérification de mot de passe plus précis basé sur des masques et des distances euclidiennes. Ce changement améliore la sécurité en permettant une comparaison plus robuste des mots de passe.
- **Améliorations** :  
  - Optimisation du calcul de la distance euclidienne entre les mots de passe et les centres de clusters pour une meilleure précision.
  - Refactoring du code de génération de masques (`maskAff()`) pour une meilleure gestion des caractères spéciaux.
  
--- 

## ✅ Checklist avant de demander une revue

Cochez les éléments ci-dessous pour confirmer que tout est en ordre :

- [x] Mon code respecte les conventions de style du projet.  
- [x] J'ai testé mes modifications localement.  
- [x] J'ai documenté mon code (si nécessaire).  
- [x] Toutes les dépendances et configurations sont mises à jour.  

---

## 🛠️ Types de changements

Cochez ce qui correspond à vos modifications :

- [x] 🐛 **Bug fix** : Correction d’un bug existant  
- [x] ✨ **Feature** : Ajout d'une nouvelle fonctionnalité  
- [x] 🔨 **Refactoring** : Amélioration du code sans changer le comportement  
- [x] 📝 **Documentation** : Mise à jour de la documentation  
- [x] 🚀 **Performance** : Amélioration de la performance du système

---

## 🧪 Tests unitaires

### 🔍 Test des méthodes principales

#### `maskAff()`
- **Objectif** : Vérifier que le masque généré pour un mot de passe est correct.
- **Détails** : Ce test s'assure que la méthode `maskAff()` génère un masque précis en fonction des caractères du mot de passe, avec une longueur de 28 et des valeurs correspondant aux catégories de caractères.
  