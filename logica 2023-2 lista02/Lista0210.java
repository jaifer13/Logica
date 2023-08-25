import java.util.Scanner;

public class Lista0210 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int idade;

        System.out.println("INFORME SUA IDADE:");
        idade = in.nextInt();

        if (idade >= 18) {
            System.out.println("ADULTO:");
        } else if (idade >= 14 && idade < 18) {
            System.out.println("JUVENIL:");
        } else if (idade >= 9 && idade < 14) {
            System.out.println("INFANTIL:");
        } else if (idade < 9) {
            System.out.println("MIRIN:");
        }
    }

}
