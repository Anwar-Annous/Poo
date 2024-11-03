package polymorphisme.ex1;

public class Voiture  extends Vehicule{
    @Override
    public void seDeplacer() {
        System.out.println("La voiture roule sur la route.");
    }
}
