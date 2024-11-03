package polymorphisme.ex1;

public class Velo extends Vehicule {
    @Override
    public void seDeplacer() {
        System.out.println("Le vélo avance à la pédale.");
    }
}
