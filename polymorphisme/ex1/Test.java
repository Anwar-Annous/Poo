package polymorphisme.ex1;

public class Test {
    //test poly
    public static void main(String[] args) {
        Vehicule[] vehicules = { new Voiture(), new Velo() };

        for (Vehicule v : vehicules) {
            v.seDeplacer();
        }
    }
}
