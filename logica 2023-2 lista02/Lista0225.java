import java.util.Scanner;


public class Lista0225 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        float produto;
        float real1;
        float centavos50;
        float centavos25;
        float centavos10;
        float centavos5;
        float valorcofre;
        System.out.println("VALOR DO PRODUTO:");
        System.out.println("NUMERO DE MOEDAS DE 1 REAL:");
        System.out.println("NUMERO DE MOEDAS DE 0.50 REAL:");
        System.out.println("NUMERO DE MOEDAS DE 0.25 REAL:");
        System.out.println("NUMERO DE MOEDAS DE 0.10 REAL:");
        System.out.println("NUMERO DE MOEDAS DE 0.05 10REAL:");
        produto=in.nextFloat();
        real1=in.nextFloat();
        centavos50=in.nextFloat();
        centavos25=in.nextFloat();
        centavos10=in.nextFloat();
        centavos5=in.nextFloat();
        valorcofre=real1*1+centavos50*0.50f+centavos25*0.25f+centavos10*0.10f+centavos5*0.05f;
        System.out.println("valor do cofre:"+valorcofre);
        if(valorcofre>=produto){
            System.out.println("PODE FAZER A COMPRA:");
            } else{
                System.out.println("FALTA DINHEIRO:");
            }













    }
    
}
