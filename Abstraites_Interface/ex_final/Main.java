package Abstraites_Interface.ex_final;

public class Main {
    public static void main(String[] args){
        System.out.println("QUESTION 7 et 8");
        System.out.println("===========================================================");

        Vehicule[] LesVehicules = new Vehicule[3] ;

        LesVehicules[0] =new Voiture("dacia", "essence");
        LesVehicules[1]=new Bateau("bateau1", "carb1");
        LesVehicules[2]=new Hydravion("hydravion2", "carb2");

        for(Vehicule v : LesVehicules){
            v.demarrer();
           v.arreter();
        }

        Bateau bateau1 = new Bateau("bateau33","carb676");
        Voiture car1 = new Voiture("bmw","Electrique");
        if ( bateau1 instanceof  Flottant){
            ((Flottant) bateau1).flotter();
        }
        if ( car1 instanceof  Roulant){
            ((Roulant) car1).rouler();
        }








        System.out.println("===========================================================");

    }
}
