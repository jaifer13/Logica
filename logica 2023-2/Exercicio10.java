import java.util.Scanner;
public class Exercicio10 {
   public static void main(String[] args){
     Scanner in = new Scanner(System.in);
     float valor;
     float socio;
     float crianca;
     float pagantes;
     float pulicototal;
     float rendadoevento;
     float valorquenaofoiarrecadado;
     System.out.println("VALOR DE INGRESSOS:"); 
     valor=in.nextFloat();
     System.out.println("NUMERO DE SOCIO:");
     socio=in.nextFloat();
     System.out.println("NUMERO DE CRIANCAS:");
     crianca=in.nextFloat();
     System.out.println("NUMERO DE PAGANTES:");
     pagantes=in.nextFloat();
     pulicototal=socio+crianca+pagantes;
     rendadoevento=((valor*socio)*0.7f)+(valor*pagantes);
     valorquenaofoiarrecadado=((valor*socio)*0.7f)+(crianca*valor);
     System.out.println("PULICO TOTAL:"+pulicototal);
     System.out.println("RENDA DO EVENTO:"+rendadoevento);
     System.out.println("VALOR QUE DEIXOU DE SER ARRECADADO:"+valorquenaofoiarrecadado);


   }






    
}
