package Exception.ex4;
import java.util.Scanner;

public class InputMismatchException  {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float nombre;
        System.out.println("entrer un float");

        try{
            nombre = scanner.nextFloat();
            System.out.println("Vous avez entré : " + nombre);
        }catch(java.util.InputMismatchException e) {
            System.out.println("Erreur : Vous devez entrer un nombre valide .");
        }

    }
}
