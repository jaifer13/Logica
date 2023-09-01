import java.util.Scanner;

public class Exc10 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    char genero;
    float pesoideal;
    float altura;
    System.out.println("INFORME ALTURA E O SEXO M=1 e F=2");
    altura = in.nextFloat();
    genero = in.next().charAt(0);
    if (genero == '1') {
      pesoideal = ((72.7f * altura) - 58f);
      System.out.println("peso ideal:" + pesoideal );
    } else if (genero == '2') {
      pesoideal = ((62.1f * altura) - 44.7f);
      System.out.println("peso ideal:" + pesoideal);
    }
  }

}
