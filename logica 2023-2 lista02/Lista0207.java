import java.util.Scanner;

public class Lista0207{
   public static void  main(String[]args){  
      Scanner in = new Scanner(System.in);
     float valorporhora;
     float horaspormes;
     float salarioatual;
     float salariomes;
     float horasatuais;
     float impostodescontado;
     System.out.println("INFORME O VALOR DA HORA TRABALHADA E O NUMERO DE HORAS MENSAIS:");
     valorporhora=in.nextFloat();
     horaspormes= in.nextFloat();
     impostodescontado=in.nextFloat();
     salariomes=(valorporhora*horaspormes)-((valorporhora*horaspormes)*0.15f);
     System.out.println("SALARIO DO MES:"+( salariomes-(salariomes*impostodescontado/100f)));
     System.out.println("QUER SABER SEU SALARIO HOJE INFORME O VALOR DA HORA QUANTAS HORAS TRABALHOU:");
     valorporhora=in.nextFloat();
     horasatuais=in.nextFloat();
     impostodescontado=in.nextFloat();
     salarioatual=(valorporhora*horasatuais)-((valorporhora*horasatuais)*0.15f);
     System.out.println("SALARIO ATUAL:"+(salarioatual-(salarioatual*impostodescontado/100f)));

   

    








   }















}
