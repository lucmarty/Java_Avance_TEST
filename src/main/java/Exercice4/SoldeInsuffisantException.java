package Exercice4;

public class SoldeInsuffisantException extends Exception {

    private double montant;

    public SoldeInsuffisantException(double montant) {
        super("Solde Insuffisant");
        this.montant = montant;
    }

    public double getMontant() {
        return montant;
    }
}
