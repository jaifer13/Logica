import java.util.Scanner;

public class Exc05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor01;
        int valor02;
        int valor03;
        System.out.println("INFORME TRES VALORES:");
        valor01 = in.nextInt();
        valor02 = in.nextInt();
        valor03 = in.nextInt();
        if ( (valor02 + valor03)<=valor01) {
            System.out.println("NAO E TRIANGULO:");
        } else if ( (valor01 + valor03)<=valor02) {
            System.out.println("NAO E TRIANGULO:");
        } else if ( (valor01 + valor02<=valor03)) {
            System.out.println("NAO E TRIANGULO:");
        } else {
            System.out.println(" E UM TRIANGULO:");

        }
    }

}
