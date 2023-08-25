import java.util.Scanner;

public class Lista0209 { 
     public static void main(String[] args ){
    Scanner  in = new Scanner(System.in);
         float raio;
         float diametro;
         float perimetro;
         float area;
         System.out.println("QUAL E O RAIO:");
         raio=in.nextFloat();
         diametro=2*raio;
         perimetro=(2*3.141692f)*raio;
         area=(3.141692f)*raio*raio;
         System.out.println("DIAMETRO:"+diametro);
         System.out.println("PERMETRO:"+perimetro);
         System.out.println("AREA:"+area);
     }

    }

