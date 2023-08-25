import java.util.Scanner;
public class Lista0211 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        float valor;
        float valor2;
        float resultado;
        float encremento=8; 
        float encremento2=10;
        System.out.println("INFORME VALOR 1 E VALOR 2:");
        valor=in.nextFloat();
        valor2=in.nextFloat();
        resultado=(valor+valor2);
          if(resultado>20f){
          System.out.println("RESULTADO:"+(resultado + encremento));
        } else{                                                                                                         
          System.out.println("RESULTADO:"+(resultado+encremento2));
        }

    }        

}
