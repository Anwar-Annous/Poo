package Abstraites_Interface.ex1;

public class Cercle extends Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double surface() {
        return Math.PI * Math.pow(rayon, 2);
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}
