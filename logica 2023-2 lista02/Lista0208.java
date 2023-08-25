import java.util.Scanner;

public class Lista0208 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float eleitores;
        float votosb;
        float votosn;
        float validos;
        System.out.println("INFORME NUMERO DE ELEITORES VOTOS BRANCO ,NULOS,VALIDOS");
        eleitores = in.nextFloat();
        votosb = in.nextFloat();
        votosn = in.nextFloat();
        validos = in.nextFloat();
        float percentualvotosb = (votosb / eleitores) * 100;
        float percentualvotosn = (votosn / eleitores) * 100;
        float percentualvotosv = (validos / eleitores) * 100;

        System.out.println("PERCEMTUAL VOTOS BRANCOS:" + percentualvotosb + "%");
        System.out.println("PERCEMTUAL VOTOS NULOS:" + percentualvotosn + "%");
        System.out.println("PERCEMTUAL VOTOS VALIDOS:" + percentualvotosv + "%");
        
    }

}
