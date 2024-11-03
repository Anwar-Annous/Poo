package Exception.ex3;

public class Test {
    public static void main(String[] args) {

         Compte cp = new Compte("souhayle", 500);

        try {
             cp.retirer(600);
            } catch (SoldeInsuffisantException e) {
            System.out.println("Erreur : " + e.getMessage());
            }
         }
}
