package polymorphisme.ex2;

public class Developpeur extends Employe{
    private String langage;

    public Developpeur(String nom, int salaire, String langage) {
        super(nom, salaire);
        this.langage = langage;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Langage: " + langage);
    }

    public void afficherLangage() {
        System.out.println("Langage utilisé: " + langage);
    }
}
