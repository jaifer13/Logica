import java.util.Scanner;

public class Lista0224 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int homem1;
        int homem2;
        int mulher1;
        int mulher2;
        int somatorio;
        int produto;
        System.out.println("Informe as idades masculinas e depois femininas:");
        homem1 = in.nextInt();
        homem2 = in.nextInt();
        mulher1 = in.nextInt();
        mulher2 = in.nextInt();
        if (homem1 < homem2 && mulher1 < mulher2) {
            somatorio = homem2 + mulher1;
            produto = homem1 * mulher2;
            System.out.println("SOMATORIO:" + somatorio);
            System.out.println("PRODUTO:" + produto);
            System.out.println("HOMEN MAIS NOVO:" + homem1);
            System.out.println("HOMEN MAIS VELHO:" + homem2);
            System.out.println("MULHER MAIS NOVA:" + mulher1);
            System.out.println("MULHER MAIS VELHO:" + mulher2);
        } else if (homem1 > homem2 && mulher1 < mulher2) {
            somatorio = homem1 + mulher1;
            produto = homem2 * mulher2;
            System.out.println("SOMATORIO:" + somatorio);
            System.out.println("PRODUTO:" + produto);
            System.out.println("HOMEN MAIS NOVO:" + homem2);
            System.out.println("HOMEN MAIS VELHO:" + homem1);
            System.out.println("MULHER MAIS NOVA:" + mulher1);
            System.out.println("MULHER MAIS VELHO:" + mulher2);
        } else if (homem1 < homem2 && mulher1 > mulher2) {
            somatorio = homem2 + mulher2;
            produto = homem1 * mulher1;
            System.out.println("SOMATORIO:" + somatorio);
            System.out.println("PRODUTO:" + produto);
            System.out.println("HOMEN MAIS NOVO:" + homem1);
            System.out.println("HOMEN MAIS VELHO:" + homem2);
            System.out.println("MULHER MAIS NOVA:" + mulher2);
            System.out.println("MULHER MAIS VELHO:" + mulher1);

        } else if (homem1 > homem2 && mulher1 > mulher2) {
            somatorio = homem1 + mulher2;
            produto = homem2 * mulher1;
            System.out.println("SOMATORIO:" + somatorio);
            System.out.println("PRODUTO:" + produto);
            System.out.println("HOMEN MAIS NOVO:" + homem2);
            System.out.println("HOMEN MAIS VELHO:" + homem1);
            System.out.println("MULHER MAIS NOVA:" + mulher2);
            System.out.println("MULHER MAIS VELHO:" + mulher1);

        }

    }

}
