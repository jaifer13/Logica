import java.util.Scanner;

public class Exc03 {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      float valor01;
      float valor02;
      float valor03;
      float soma1;
      float soma2;
      float soma3;
      System.out.println("INFORME TRES VALORES:");
      valor01 = in.nextFloat();
      valor02 = in.nextFloat();
      valor03 = in.nextFloat();
      if (valor01 < valor02 && valor01 < valor03) {
         soma2 = valor02 + valor03;
         System.out.println("SOMA:" + soma2);
      } else if (valor02 < valor01 && valor02 < valor03) {
         soma3 = valor01 + valor03;
         System.out.println("SOMA:" + soma3);
      } else if (valor03 < valor02 && valor03 < valor01) {
         soma1 = valor01 + valor02;
         System.out.println("SOMA:" + soma1);
      }
   }

}
