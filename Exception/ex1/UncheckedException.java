package Exception.ex1;

public class UncheckedException {
    public static void main(String[] args){
        int a =5 ;
        int b = 0 ;
        try{
            int division = a/b;
        }catch (ArithmeticException e){
            System.out.println("Erreur : Division par zéro !");
        }finally {
            System.out.println("le programme se termine correctement");
        }
    }
}
