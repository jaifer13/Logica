import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float distancia;
        float velocidamedia;
        float tempo;
        System.out.println("INFORME A DISTANCIA DO TRAJETO:");
        distancia = in.nextInt();
        System.out.println("INFORME A VELOCIDADE MEDIA DA VIAGEM:");
        velocidamedia = in.nextFloat();
        tempo = distancia / velocidamedia;
        System.out.println("TEMPO EM HORA:" + tempo);

    }
}