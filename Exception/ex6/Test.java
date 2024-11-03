package Exception.ex6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Compte compte = new Compte(500); // solde initial de 500
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez un montant à retirer : ");

        try {
            double montant = scanner.nextDouble();
            compte.retirer(montant);
        } catch (MontantNegatifException e) {
            System.out.println(e.getMessage());
        } catch (SoldeInsuffisantException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Veuillez entrer un nombre valide.");
        }
    }
}
