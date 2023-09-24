import java.util.Scanner;

public class Exc02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero = 0;
        int soma = 0;
        int contador = 2;
        System.out.println("INFORME O NUMERO");
        numero = in.nextInt();
        while(contador<=numero){
            if (contador % 2 == 0) {
            System.out.println(contador);    
            soma=soma+contador;
        }
        contador++;
    }
    System.out.println();    
    System.out.println(soma);    
}
}
