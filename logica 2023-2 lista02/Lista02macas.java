import java.util.Scanner;

public class Lista02macas {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        float macas;
        float encremento=1.50f; 
        float encremento2=1.30f;
        System.out.println("INFORME NUMERO DE MACAS DA COMPRA:");
        macas=in.nextFloat();  
          if(macas>=12f){
          System.out.println("RESULTADO:" +macas * encremento);
        } else{                                                                                                         
          System.out.println("RESULTADO:"+(macas*encremento2));
        }

    }        

}
