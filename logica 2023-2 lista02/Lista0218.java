import java.util.Scanner;
public class Lista0218 {
    public static void main(String[]args){
        Scanner in =new Scanner(System.in);
        int numerodecarros;
        float valorporcarros;
        float salariofixo;
        float valordasvendas;
        float salariofinal;
        System.out.println("INFORME VALORES, NUMEROS DE CARROS,VALOR TOTAL DAS VENDAS ,SALARIO FIXO E VALOR POR CARROS:");
        numerodecarros=in.nextInt();
        valordasvendas=in.nextFloat();
        salariofixo=in.nextFloat();
        valorporcarros=in.nextFloat();
        salariofinal=salariofixo+(valorporcarros*numerodecarros)+(0.05f*valordasvendas);
        System.out.println("SALARIO FINAL:"+salariofinal);

        








    }









    
}
