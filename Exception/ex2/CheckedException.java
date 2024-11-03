package Exception.ex2;
import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) throws Exception {

      Scanner  scanner = new Scanner(System.in);
        System.out.println("entrer un nombre");
        String nombre = scanner.nextLine();
         convertirEnEntier(nombre);
    }


    public  static void convertirEnEntier(String nombre) throws Exception{
        try{
            int resultat= Integer.parseInt(nombre) ;
            System.out.println("La conversion est réussie : " + resultat);
        }catch(NumberFormatException e){
            System.out.println(" Erreur : la saisie n’est pas un nombre valide");
        }finally {
            System.out.println("Conversion Terminée");
        }
    }
}


