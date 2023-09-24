import java.util.Scanner;

public class Exc03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO:");
        int numero = in.nextInt();
        int contador = 2;

        int divisores = 0;
        if (numero == 1 || numero == 4) {
            System.out.println("caso especial");
        }
        while (contador < numero / 2) {
            if (numero % contador == 0) {
                System.out.println("DIVISVEL POR " + contador);
                divisores = 1;
                break;
            }
            contador++;
        }

        if (divisores == 0 && numero != 1 && numero != 4) {
            System.out.println("NUMERO PRIMO");
        }

    }
}
