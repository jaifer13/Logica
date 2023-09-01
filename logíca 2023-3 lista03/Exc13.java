import java.util.Scanner;

public class Exc13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String produto;
        int quantiad;
        float preco;
        float total = 0;
        float desconto = 0.f;
        float pagar = 0;
        System.out.println("Informe produto");
        produto = in.next();
        System.out.println("Quantidade");
        quantiad = in.nextInt();
        System.out.println("Preco unitario");
        preco = in.nextFloat();
        System.out.println();
        if (produto.equals("calca")) {
            if (quantiad <= 5) {
                total = quantiad * preco;
                desconto = total * 0.02f;
                pagar = total - desconto;
                System.out.println(total);
                System.out.printf("Desconto %f\n", desconto);
                System.out.println(pagar);
            } else if ( quantiad>5 && quantiad <= 10) {
                total = quantiad * preco;
                desconto = total * 0.03f;
                pagar = total - desconto;
                System.out.println(total);
                System.out.printf("Desconto %f\n", desconto);
                System.out.println(pagar);
            }else if(quantiad>10){
                total = quantiad * preco;
                desconto = total * 0.05f;
                pagar = total - desconto;
                System.out.println(total);
                System.out.printf("Desconto %f\n", desconto);
                System.out.println(pagar);
            }
System.out.println(produto);
        }

    }

}
