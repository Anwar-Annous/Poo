package Abstraites_Interface.ex2;

public class ProduitElectronique implements Produit {

    private String nom;
    private double prix;
    private int quantite;

    public ProduitElectronique(String nom, double prix, int quantite) {
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    @Override
    public double getPrix() {
        return prix;
    }

    @Override
    public int getQuantite() {
        return quantite;
    }

    @Override
    public double calculer_stocke() {
        return prix * quantite;
    }

}
