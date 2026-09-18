import Exercice4.CompteBancaire;
import Exercice4.SoldeInsuffisantException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompteBancaireTest {

    CompteBancaire compte;

    @BeforeEach
    void setUp() {
        compte = new CompteBancaire(500);
    }

    @Test
    void testInitialValue() {
        assertEquals(compte.getSolde(), 500);
    }

    @Test
    void testDeposer() {
        compte.deposer(100);
        assertEquals(compte.getSolde(), 600);
    }

    @Test
    void testRetirer() throws SoldeInsuffisantException {
        compte.retirer(100);
        assertEquals(compte.getSolde(), 400);
    }

    @Test
    void testException() throws SoldeInsuffisantException {
        SoldeInsuffisantException exception = assertThrows(
                SoldeInsuffisantException.class,
                () -> compte.retirer(600)
        );
        assertEquals(exception.getMessage(), "Solde Insuffisant");
        assertEquals(exception.getMontant(), 600);
    }
}
