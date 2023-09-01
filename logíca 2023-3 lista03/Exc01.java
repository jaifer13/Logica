import java.util.Scanner;

public class Exc01 {
    
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        
        int valor;
        System.out.println("DIGITE UM NUMERO");
        valor=in.nextInt();
         if(valor>=1){
            System.out.println("positivo");
         }else if(valor<=-1)
            System.out.println("negativo");
            else {
                System.out.println("zero");
            }


    }
}
