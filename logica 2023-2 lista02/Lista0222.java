import java.util.Scanner;

public class Lista0222 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        float saldo;
        float debito;
        float credito;
        float saldoatual;
        int numerodaconta;
        System.out.println("INFORME NUMERO DA CONTA ,SALDO,DEBITO E CREDITO:");
        numerodaconta=in.nextInt();
        saldo=in.nextFloat();
        debito=in.nextFloat();
        credito=in. nextFloat();
        saldoatual=saldo-debito+credito;
           if(saldoatual>=0){
             System.out.println("SALDO ATUAL:"+saldoatual+"POSITIVO");
           } else{
             System.out.println("SALDO ATUA:"+saldoatual+"NEGATIVO");
           }










    }










    
}
