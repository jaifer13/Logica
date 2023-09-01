import java. util.Scanner;

public class Exc06 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        int gol2;
        int gol1;
        String time1;
        String time2;

        System. out.println("INFORME NOME DO TIME NUMERO DE GOLS:");
        System.out.println("INFORME NOME DO TIME E O NUMERO DE GOLS: ");
        time1=in.next();
        gol1=in.nextInt();
        time2=in.next();
        gol2=in.nextInt();
        if(gol1>gol2){
            System.out.println("VENCEDOR TIME:" +time1);
        }else if(gol1<gol2)
            System.out.println("VENCEDOR TIME:" +time2);
        else{
            System .out.println("EMPATE");
        }



    }
}
