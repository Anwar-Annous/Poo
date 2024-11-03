package Abstraites_Interface.ex2;

public class ProduitAlimentaire  implements  Produit{

    private String nom_produit;
    private double prix_produit;
    private int quantite_produit;

    public ProduitAlimentaire(String nom, double prix, int quantite) {
        this.nom_produit = nom;
        this.prix_produit = prix;
        this.quantite_produit = quantite;
    }

    @Override
    public double getPrix() {
        return prix_produit;
    }

    @Override
    public int getQuantite() {
        return quantite_produit;
    }

    @Override
    public double calculer_stocke() {
        return prix_produit * quantite_produit;
    }


}
