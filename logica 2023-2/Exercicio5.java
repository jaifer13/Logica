import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args ){
        Scanner  in = new Scanner(System.in);
        float fahrenheit,celsius;
        float resultado;
        System.out.println("INFORME A TEMPERATURA EM FAHRENHEIT"); 
        fahrenheit=in.nextFloat();
        resultado=((fahrenheit-32)/9)*5;
        System.out.println("VALOR EM CELSIUS:"+resultado);
    }


    
}
