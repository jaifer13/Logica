import java.util.Scanner;
public class Lista0203 {
    public static void main(String[]args){
      Scanner in = new Scanner(System.in);
         float valor;
         System.out.println("INFORME O VALOR");
         valor=in.nextFloat();
         if(valor>=0){
            System.out.println("POSITIVO:");
         }  else{
            System.out.println("NEGATIVO:");
         }
    } 
}
