import java.util.Scanner;
public class Exercicio4 {
           public static void main (String[] args){
            Scanner in = new Scanner(System.in);
            float base;
            float altura;
            float area;
            System.out.println("INFORME PRIMEIRO A BASE DO TRIANGULO DEPOIS A ALTURA"); 
            base=in.nextInt();
            altura=in.nextFloat();
            area=base*altura/2;
            System.out.println("AREA:"+area);
    
        }
    
}
