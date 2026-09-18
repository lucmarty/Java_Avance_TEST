package Exercice4;

public class CompteBancaire {

    private double solde;

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) throws SoldeInsuffisantException {
        if (montant > this.solde) {
            throw new SoldeInsuffisantException(montant);
        }
        this.solde -= montant;
    }

    public double getSolde() {
        return solde;
    }
}

