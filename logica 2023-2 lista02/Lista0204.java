import java.util.Scanner;

public class Lista0204 {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int numero01=0;
       int numero02=0;
       System.out.println("INFORME OS VALORES:");
       numero01=in.nextInt();
       numero02=in.nextInt();
       if(numero01>numero02){
          System.out.println("NUMERO 01 E MAIOR:"+ numero01);
       }  else if(numero01<numero02){
          System.out.println("NUMERO 02 E MAIOR:"+numero02);
        }
    }
    
}
