package Exception.ex5;

public class Test {
    public static  void main(String[] args){
        Compte c1 = new Compte("souhayle" ,500 );

        try{
             c1.retirer(-200);
        }catch(MontantNegatifException e){
            System.out.println(e.getMessage());
        }
    }
}
