# SecurePasswordAnalyzer

`SecurePasswordAnalyzer` est une bibliothèque Java conçue pour évaluer la robustesse des mots de passe. Elle utilise des algorithmes avancés pour comparer la structure des mots de passe à des modèles prédéfinis, en mesurant leur distance par rapport à des centres de référence.

---

## 📋 Fonctionnalités

- **Chargement dynamique** des modèles de clusters à partir de fichiers externes ou intégrés.
- **Analyse des mots de passe** : Extraction et évaluation des caractéristiques des mots de passe.
- **Calcul de distance** : Mesure la distance mathématique entre un mot de passe et des points de référence.
- **Génération de hachages sécurisés** : Support des algorithmes MD5 et SHA-256.

---

## 💃 Structure du projet

### Méthodes principales

- **`loadClusters(File file)`** : Charge les modèles de référence à partir d'un fichier CSV.
- **`analyzePassword(String password)`** : Génère un profil de caractéristiques pour un mot de passe.
- **`calculateDistance(String password)`** : Calcule la distance entre le mot de passe et les centres prédéfinis.
- **`generateHash(String password, String algorithm)`** : Produit un hachage du mot de passe avec l'algorithme spécifié (MD5 ou SHA-256).

---

## 🚀 Exemple d'utilisation

Voici un exemple simple d'utilisation de la bibliothèque `SecurePasswordAnalyzer` :

### Code Java

```java
import secure.analyzer.SecurePasswordAnalyzer;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // Initialisation et chargement des clusters
            SecurePasswordAnalyzer analyzer = new SecurePasswordAnalyzer();
            analyzer.loadClusters(new File("data/cluster_model.csv"));

            // Analyse d'un mot de passe
            String password = "MonMotDePasseSecurise2024!";
            double score = analyzer.calculateDistance(password);
            System.out.println("Score de sécurité : " + score);

            // Génération d'un hachage SHA-256
            String hash = analyzer.generateHash(password, "SHA-256");
            System.out.println("Hachage SHA-256 : " + hash);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
```

---

### 📄 Format des fichiers de clusters

Les fichiers de clusters doivent être au format **CSV**. Chaque ligne représente un centre de référence composé de valeurs numériques séparées par des virgules. Exemple :

```
0.25,0.5,0.75,1.0
0.3,0.6,0.8,0.9
```

---

## 🛠️ Dépendances

- **Java SE 8+** : Aucune dépendance externe supplémentaire n'est requise.

---

## 🖥️ Compilation et exécution

### Compilation

Utilise la commande suivante pour compiler ton projet :

```bash
javac -d out/production src/secure/analyzer/SecurePasswordAnalyzer.java
```

### Exécution

Exécute le programme avec la commande suivante :

```bash
java -cp out/production secure.analyzer.Main
```

---

## ✅ Tests et validations

- **Robustesse** : Teste le programme avec des fichiers de clusters variés.
- **Complexité des mots de passe** : Évalue des mots de passe simples et complexes pour observer les scores de sécurité.
- **Hachage** : Vérifie les hachages générés avec des outils externes pour garantir leur fiabilité.

---

## 📥 Contribution

Les contributions sont les bienvenues ! Voici comment participer :

1. **Forker** le dépôt GitHub.
2. **Créer une branche** pour vos modifications (`feature/ma-fonctionnalite`).
3. **Soumettre une Pull Request** avec une description claire de vos améliorations.

---

## 📜 Licence

Ce projet est distribué sous la licence **MIT**. Consultez le fichier `LICENSE` pour plus d'informations.

---

## 🤝 Remerciements

Merci d'utiliser **SecurePasswordAnalyzer** !  
N'hésitez pas à ouvrir une **issue** ou à proposer une **pull request** si vous avez des suggestions.

---

### Auteur

- **Nom :** Abdelmjid Abbaoui 
- **Projet réalisé dans le cadre de :** TP1 revue de code
- **Date :** Decembre 2024
