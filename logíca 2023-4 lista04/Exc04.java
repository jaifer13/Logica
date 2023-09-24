import java.util.Scanner;

public class Exc04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float saldo = 0;
        float saque = 0;
        float deposito;
        int sair=0;
        int opcao;
        while (sair!=4) {

            System.out.println("Digite a opcao 1 =saldo,2=saque,3= deposito;4 =sair:");
            opcao = in.nextInt();
            if (opcao == 1) {
            
            } else if (opcao == 2) {
                System.out.println("Digite o valor do saque");
                saque = in.nextFloat();
                saldo = saldo - saque;
            } else if (opcao == 3) {
                System.out.println("Digite o valor do deposito");
                deposito = in.nextFloat();
                saldo = saldo + deposito;
            } else {
                sair=4;

            }
            System.out.println("seu saldo atual R$=:" + saldo);
        }

    }

}
