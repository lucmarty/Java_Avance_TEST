import Exercice2.ValidateurEmail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ValideurEmailTest {

    @Test
    void testEmailVide() {
        assertFalse(ValidateurEmail.estValide(""));
    }

    @Test
    void testEmailNull() {
        assertFalse(ValidateurEmail.estValide(null));
    }

    @Test
    void testMauvaiseSyntax() {
        assertFalse(ValidateurEmail.estValide("email.com"));
        assertFalse(ValidateurEmail.estValide("email@com"));
        assertFalse(ValidateurEmail.estValide("emailcom"));
    }

    @Test
    void testBonneSyntax() {
        assertTrue(ValidateurEmail.estValide("le@email.com"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aaaa@bbbb.com", "bbbb@.", "@."})
    void testValideMails(String mails) {
        assertTrue(ValidateurEmail.estValide(mails));
    }

    @ParameterizedTest
    @ValueSource(strings = {"aaaabbbb.com", "bbbb@", ""})
    void testNonValideMails(String mails) {
        assertFalse(ValidateurEmail.estValide(mails));
    }
}
