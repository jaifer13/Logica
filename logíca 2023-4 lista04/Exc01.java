import java.util.Scanner;

public class Exc01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        int contador = 1;
        System.out.println("INFORME O NUMERO");
        numero = in.nextInt();
        while (contador <= numero) {
            soma = soma + contador;

            contador++;
        }

        System.out.println();
        
        System.out.println("Soma:" + soma);
    }

}
