import java.util.Scanner;

public class Lista0223 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int estoqueatual;
        int quantidademax;
        int quantidademin;
        int quantidademedia;
        System.out.println("INFORME ESTOQUE ,ESTOQUE MAXIMO E ESTOQUE MINIMO:");
        estoqueatual=in.nextInt();
        quantidademax= in.nextInt();
        quantidademin=in.nextInt();
        quantidademedia=(quantidademax+quantidademin)/2;
          if(estoqueatual>=quantidademedia){
            System.out.println("NAO EFETUAR COMPRA;");
          } else{
            System.out.println("EFETUAR COMPRA");
          }







    }
    
}
