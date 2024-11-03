package Abstraites_Interface.ex1;

public  class Triangle extends Forme {
    private double a;
    private double b;
    private double c;
    private double hauteur;

    public Triangle(double a, double b, double c, double hauteur) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.hauteur = hauteur;
    }

    @Override
    public double surface() {
        return 0.5 * a * hauteur;
    }

    @Override
    public double perimetre() {
        return a + b + c;
    }
}
