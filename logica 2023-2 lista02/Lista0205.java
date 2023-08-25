import java.util.Scanner;

public class Lista0205 {
        public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       float numero01=0;
       float numero02=0;
       float resultado=0;
       System.out.println("INFORME OS VALORES:");
       numero01=in.nextFloat();
       numero02=in.nextFloat();
       resultado=numero01/numero02;
       if(numero02==0){
          System.out.println("Erro denominador igual a zero");
       }  else {
          System.out.println("Reultado:"+resultado);
        }
    }
    
}
