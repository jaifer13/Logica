import java.util.Base64;
import java.util.Scanner;

public class Lista0202 {
    public static void main(String[] args ){
        Scanner  in = new Scanner(System.in);
        float base;
        float altura;
        float area;
        float perimetro;
        System.out.println("INFORME BASE E ALTURA"); 
        base =in.nextFloat();
        altura=in.nextFloat();
        area=base*altura;
        perimetro=((base+altura)*2f);
        System.out.println("MEDIDA DA AREA:"+ area);
        System.out.println("MEDIDA DO PERIMETRO"+ perimetro);
    }
    
}
