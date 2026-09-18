import Exercice3.Compteur;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompteurTest {

    Compteur compteur;

    @BeforeEach
    void setUp() {
        compteur = new Compteur();
        System.out.println("Début du test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Fin du test");
    }

    @Test
    void testInitialValue() {
        assertEquals(compteur.getValeur(), 0);
    }

    @Test
    void testIncrementValue() {
        compteur.incrementer();
        assertEquals(compteur.getValeur(), 1);
    }

    @Test
    void testIncrementAndReset() {
        compteur.incrementer();
        compteur.incrementer();
        compteur.incrementer();
        assertEquals(compteur.getValeur(), 3);
        compteur.reinitialiser();
        assertEquals(compteur.getValeur(), 0);
    }
}
