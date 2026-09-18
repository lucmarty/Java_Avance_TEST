package Exercice2;

public class ValidateurEmail {

    public static boolean estValide(String email) {
        if (email == null) {
            return false;
        }
        if (email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }
}
