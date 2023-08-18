import java .util.Scanner;
public class Exc02 {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        float valor=0;          //variavel
        float porcento=1.20f;       //variavel
        float atualizado=0;      //variavel
        System.out.println("Digite um valor");
        valor=in.nextFloat();         //ler o numero do usuario
        atualizado= valor*porcento;        //condiçao
        System.out.print("Seu valor atualizado e:"+ atualizado);




    }
    
}

