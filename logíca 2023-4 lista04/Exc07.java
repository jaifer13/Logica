import java.util.Scanner;

public class Exc07 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int senha = 12345;
        int quantidade = 0;
        while (true) {
            System.out.println("Informe senha ");
            senha = in.nextInt();
            if (senha == 12345) {
                quantidade = quantidade + 1;
                System.out.println("senha correta:" + quantidade + "tetativas");
                break;
            } else {
                System.out.println("senha errada");
                if(quantidade==3-1){
                    quantidade=quantidade+1;
                    System.out.println("acesso negado terminal broqueado"+ quantidade+"tentativas");
                    break;
                }
            }
            quantidade++;
        }
    }
}
