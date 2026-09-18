import Exercice1.Calculatrice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatriceTest {

     @Test
     void testAddition() {
        Calculatrice calculatrice = new Calculatrice();
        int resultat = calculatrice.addition(2, 3);
        assertEquals(5, resultat);
    }

    @Test
    void testSoustraction() {
        Calculatrice calculatrice = new Calculatrice();
        int resultat = calculatrice.soustraction(5, 3);
        assertEquals(2, resultat);
    }

    @Test
    void testMultiplication() {
        Calculatrice calculatrice = new Calculatrice();
        int resultat = calculatrice.multiplication(4, 3);
        assertEquals(12, resultat);
    }

    @Test
    void testDivision() {
        Calculatrice calculatrice = new Calculatrice();
        int resultat = calculatrice.division(10, 2);
        assertEquals(5, resultat);
    }

    @Test
    void divisionParZeroException() {
        Calculatrice calculatrice = new Calculatrice();
        assertThrows(
                ArithmeticException.class,
                () -> calculatrice.division(10, 0)
        );
    }
}