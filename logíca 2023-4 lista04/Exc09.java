import java.util.Scanner;

public class Exc09 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int idade;
        do {
            System.out.println("Informe sua idade");
            idade = in.nextInt();
        } while (idade < 0 || idade > 150);
        System.out.println("Idade valida");
        System.out.println(idade);

    }
}