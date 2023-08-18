import java.util.Scanner;

public class Exercicio8 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        float eleitores;
        float votosvalidos;
        float votosbrancos;
        float votosnulos;
        float percentualvalidos;
        float percentualbrancos;
        float percentualnulos;
        System.out.println("NUMERO DE ELEITORES:"); 
        eleitores=in.nextInt();
        System.out.println("NUMERO DE VOTOS VALIDOS:");
        votosvalidos=in.nextFloat();
        System.out.println("NUMERO DE VOTOS BRANCOS:");
        votosbrancos=in.nextFloat();
        System.out.println("NUMERO DE VOTOS NULOS:");
        votosnulos=in.nextFloat();
        percentualvalidos=votosvalidos/eleitores;
        percentualbrancos=votosbrancos/eleitores;
        percentualnulos=votosnulos/eleitores;
        System.out.println("PERCENTUAL DE VOTOS VALIDOS:"+percentualvalidos);
        System.out.println("PERCENTUAL DE VOTOS BRANCOS:"+percentualbrancos);
        System.out.println("PERCENTUAL DE VOTOS NULOS:"+percentualnulos);





    }

        

}