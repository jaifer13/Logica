import java.util.Scanner;

public class Exc04 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int valor01;
    int valor02;
    int valor03;
    System.out.println("INFORME TRES VALORES:");
    valor01 = in.nextInt();
    valor02 = in.nextInt();
    valor03 = in.nextInt();
    if ((valor01 < valor02) && (valor02 < valor03)) {
      System.out.println("ORDEM 1:" + valor01 + valor02 + valor03);
    } else if (valor01 < valor03 && valor03 < valor02) {
      System.out.println("ORDEM 2:" + valor01 + valor03 + valor02);
    } else if (valor02 < valor03 && valor03 < valor01) {
      System.out.println("ORDEM 3:" + valor02 + valor03 + valor01);
    } else if (valor02 < valor01 && valor01 < valor03) {
      System.out.println("ORDEM 4:" + valor03 + valor02 + valor01);
    } else if (valor03 < valor01 && valor01 < valor02) {
      System.out.println("ORDEM 5:" + valor03 + valor01 + valor02);
    } else if (valor03 < valor02 && valor02 < valor01) {
      System.out.println("ORDEM 6:" + valor03 + valor02 + valor01);
    }
  }

}

