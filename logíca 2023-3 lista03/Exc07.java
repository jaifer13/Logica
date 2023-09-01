import java.util.Scanner;

import javax.sound.midi.Sequencer.SyncMode;

public class Exc07 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    float litros;
    float valorgasolina=0f;
    float valoralcool = 0f;
    String tipoComusivel;
    System.out.println("INFORME O TIPO DE COMBUSTIVEL E QUANTIDADE DE LITROS");
    tipoComusivel = in.next();
    litros = in.nextFloat();
    if (tipoComusivel.equals("G")) {
      if (litros <= 20) {
        valorgasolina = (litros * (4.30f * 0.97f));
        System.out.println("VALOR :" + valorgasolina);
      } else {
        valorgasolina = (litros * (4.30f * 0.95f));
        System.out.println("VALOR :" + valorgasolina);
      }
    } else if (tipoComusivel.equals("A")) {
      if (litros <= 20) {
        valoralcool = (litros * (3.90f * 0.96f));
        System.out.println("VALOR:" + valoralcool);
      } else {
        valoralcool = (litros * (3.90f * 0.94f));
        System.out.println("VALOR:" + valoralcool);
      }
    }

  }

}
