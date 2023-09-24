import java.util.Scanner;

public class Exc06 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int valor;
        System.out.println("Informe um valor ");
        valor = in.nextInt();
        while (true) {
            if (valor > 0 && valor < 10) {
                System.out.println();
                System.out.println(valor);

                break;
            } else if (valor < 0 || valor > 10) {

                System.out.println(valor);
                System.out.println();
                System.out.println("Informe outro valor ");

                valor = in.nextInt();
            }

        }
    }
}