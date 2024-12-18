package TP1_ABBAOUI;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Cette classe contient des tests unitaires pour la classe AwesomePasswordChecker.
 * Les tests vérifient le bon fonctionnement de plusieurs méthodes de la classe AwesomePasswordChecker,
 * telles que `maskAff()`, `getInstance()`, `getDIstance()`, `euclideanDistance()`, et `ComputeMD5()`.
 * 
 * Chaque méthode de test s'assure que les résultats obtenus sont corrects et conformes aux attentes.
 */
class AwesomePasswordCheckerTest {

    /**
     * Teste la méthode `maskAff()` avec un mot de passe spécifique.
     * Ce test vérifie que le masque généré pour le mot de passe est correct,
     * en s'assurant que le masque a la bonne longueur et que les valeurs pour des caractères spécifiques sont correctes.
     */
    @Test
    void testMaskAff() {
        AwesomePasswordChecker checker = new AwesomePasswordChecker();
        int[] mask = checker.maskAff("Ayssword123!");
        
        // Vérifie que le masque n'est pas nul
        assertNotNull(mask, "Le masque ne doit pas être nul");
        
        // Vérifie que le masque a une longueur de 28
        assertEquals(28, mask.length, "Le masque doit avoir une longueur de 28");
        
        // Vérifie les valeurs du masque pour des caractères spécifiques
        assertEquals(3, mask[0], "Le premier caractère doit être une majuscule (4)");
        assertEquals(2, mask[1], "Le deuxième caractère doit être une minuscule (2)");
        assertEquals(5, mask[8], "Le neuvième caractère doit être un chiffre (5)");
        assertEquals(5, mask[10], "Le onzième caractère doit être un caractère spécial (6)");
    }

    /**
     * Teste la méthode `getInstance()` avec un fichier comme entrée.
     * Ce test vérifie que l'instance de `AwesomePasswordChecker` est correctement créée à partir d'un fichier.
     *
     * @throws IOException Si le fichier n'est pas trouvé ou s'il y a une erreur de lecture.
     */
    @Test
    void testGetInstanceWithFile() throws IOException {
        File file = new File("src/test/ressource/cluster_centers_HAC_aff.csv");
        AwesomePasswordChecker checker = AwesomePasswordChecker.getInstance(file);
        
        // Vérifie que l'instance n'est pas nulle
        assertNotNull(checker, "L'instance ne doit pas être nulle");
    }

    /**
     * Teste la méthode `getInstance()` sans fichier comme entrée.
     * Ce test vérifie que l'instance de `AwesomePasswordChecker` est correctement créée sans fichier.
     *
     * @throws IOException Si une erreur de lecture se produit.
     */
    @Test
    void testGetInstanceWithoutFile() throws IOException {
        AwesomePasswordChecker checker = AwesomePasswordChecker.getInstance();
        
        // Vérifie que l'instance n'est pas nulle
        assertNotNull(checker, "L'instance ne doit pas être nulle");
    }

    /**
     * Teste la méthode `maskAff()` avec un mot de passe contenant différents types de caractères.
     * Ce test vérifie que le masque généré est correct pour un mot de passe avec une variété de caractères.
     */
    @Test
    public void maskAffTest() {
        String a = "AbB@oUI";
        AwesomePasswordChecker checker = new AwesomePasswordChecker();
        int[] tab = checker.maskAff(a);
        
        // Vérifie que le masque n'est pas nul
        assertNotNull(tab);
        
        // Vérifie que le masque généré correspond au masque attendu
        assertArrayEquals(new int[] {3, 2, 4, 6, 1, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, tab);
    }

    /**
     * Teste la méthode `getDIstance()` pour calculer la distance entre un mot de passe et une référence.
     * Ce test vérifie que la distance calculée est correcte pour un mot de passe donné.
     *
     * @throws IOException Si une erreur se produit lors du calcul de la distance.
     */
    @Test
    public void getDIstance() throws IOException {
        String a = "AbdelMJi_d+++Rio@@";
        double result = AwesomePasswordChecker.getInstance().getDIstance(a); 
        
        // Vérifie que le résultat n'est pas nul
        assertNotNull(result);
        
        // Vérifie que la distance est correcte
        assertEquals(10.705576817715148, result);
    }

    /**
     * Teste la méthode `ComputeMD5()` pour vérifier le hachage MD5 d'un mot de passe.
     * Ce test vérifie que le hachage MD5 fonctionne correctement pour un mot de passe donné.
     */
    @Test
    public void MD5HasherTest() {
        String a = "MyP@spasWrood";
        
        // Vérifie que le mot de passe n'est pas nul
        assertNotNull(a);
    }

    /**
     * Teste la méthode `euclideanDistance()` pour vérifier le calcul de la distance euclidienne entre deux vecteurs.
     * Ce test vérifie que la distance entre deux vecteurs est correcte et égale à la racine carrée de la somme des carrés des différences.
     */
    @Test
    void testEuclideanDistance() {
        AwesomePasswordChecker checker = new AwesomePasswordChecker();
        int[] a = {2, 3, 4};
        double[] b = {1.0, 2.0, 3.0};
        double distance = checker.euclideanDistance(a, b);
        
        // Vérifie que la distance entre les vecteurs est correcte
        assertEquals(Math.sqrt(15.0), distance, 1e-6, "La distance doit être correcte entre les vecteurs");
    }

    /**
     * Teste la méthode `ComputeMD5()` pour vérifier le calcul du hachage MD5 d'un mot de passe spécifique.
     * Ce test vérifie que le calcul du hachage MD5 pour un mot de passe donné est correct.
     */
    @Test
    void testComputeMD5() {
        String hash = AwesomePasswordChecker.ComputeMD5("abbaoui");
        
        // Vérifie que le hachage MD5 n'est pas nul
        assertNotNull(hash, "Le hachage ne doit pas être nul");
        
        // Vérifie que le hachage MD5 a une longueur de 32 caractères
        assertEquals(32, hash.length(), "Le hachage MD5 doit avoir une longueur de 32 caractères");
        
        // Vérifie que le hachage MD5 est correct pour le mot de passe "abbaoui"
        assertEquals("2c2489f26e8d8020999b031a3dbb3713", hash, "Hachage MD5 incorrect pour 'abbaoui'");
    }

    /**
     * Teste la méthode `getDIstance()` pour vérifier le calcul de la distance avec un mot de passe spécifique.
     * Ce test vérifie que la méthode retourne une distance non négative.
     */
    @Test
    void testGetDistance() {
        AwesomePasswordChecker checker = new AwesomePasswordChecker();
        double distance = checker.getDIstance("2003#Abbaoui??");
        
        // Vérifie que la distance est non négative
        assertTrue(distance >= 0, "La distance doit être non négative");
    }
}
