import java.util.Scanner;

public class Lista0219 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        float kminicial;
        float kmfinal;
        float litrosgatos;
        float receita;
        float mediadeconsumo;
        float lucro;
        System.out.println("INFORME KM INICIAL,KM FINAL,RECEITADO DIA E LITROS GASTOS:");
        kminicial=in.nextFloat();
        kmfinal=in.nextFloat();
        receita=in.nextFloat();
        litrosgatos=in.nextFloat();
        mediadeconsumo=((kmfinal-kminicial)/litrosgatos);
        lucro=receita-(litrosgatos*4.599f);
        System.out.println("MEDIA E LUCRO:"+mediadeconsumo+" "+ lucro);
    





    }













    
}
