package Exception.ex6;

public class Compte {
    private double solde;

    public Compte(double solde) {
        this.solde = solde;
    }

    public void retirer(double montant) throws SoldeInsuffisantException, MontantNegatifException {
        if (montant < 0) {
            throw new MontantNegatifException("Erreur : Le montant à retirer ne peut pas être négatif.");
        }
        if (montant > solde) {
            throw new SoldeInsuffisantException("Erreur : Solde insuffisant !");
        }
        solde -= montant;
        System.out.println("Retrait effectué. Nouveau solde : " + solde);
    }

    public double getSolde() {
        return solde;
    }
}
