package polymorphisme.ex2;

public class Employe {
    private String nom;
    private int salaire;

    public Employe(String nom, int salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    public void afficherInfos() {
        System.out.println("Nom: " + nom + ", Salaire: " + salaire);
    }
}

