import java .util.Scanner;

public class Exc03 {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        int numero=0;   //variavel
        int quadrado=0; //variavel
        System.out.println("Informe um numero:");
        numero= in.nextInt();
        quadrado=numero*numero;  // condiçao
        System.out.println("O valor e :\n" + quadrado);

    } 
    
}
