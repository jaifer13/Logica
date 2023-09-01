import java.util.Scanner;

public class Exc02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float valor01;
        float valor02;
        float valor03;
        float maior;
        System.out.println("INFORME TRES VALORES:");
        valor01 = in.nextFloat();
        valor02 = in.nextFloat();
        valor03 = in.nextFloat();
        if (valor01 > valor02 && valor01 > valor03) {
            System.out.println("MAIOR VALOR 01 :" + valor01);
        } else if (valor01 < valor02 && valor03 < valor02)
            System.out.println("MAIOR VALOR 02:" + valor02);
        else {

            System.out.println("MAIOR VALOR 03:" + valor03);

        }

    }

}
