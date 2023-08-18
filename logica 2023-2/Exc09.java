import java.util.Scanner;
public class Exc09{
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        float homens,mulheres,criancas;
        float total;
        System.out.println("INFORME QUANTIDADE DE HOMENS,MULHERES E CRIANÇAS");     
        homens=in.nextFloat();
        mulheres=in.nextFloat();
        criancas=in.nextFloat(); 
        total=( homens*400 )+( mulheres*320 )+(criancas*200);
        System.out.println("QUANTIDADE EM QUILOS:"+ total * 1.2 ) ;




    }
}