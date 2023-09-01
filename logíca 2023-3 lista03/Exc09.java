import java.util.Scanner;

public class Exc09 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota01;
        float nota02;
        float optativa03;
        float media;
        System.out.println("INFORME TRES VALORES:");
        nota01 = in.nextFloat();
        nota02 = in.nextFloat();
        optativa03 = in.nextFloat();
        media=(nota01+nota02+optativa03)/3;
        if (media>=6) {
            System.out.println("Aprovado :" + media);
        } else if (media<3){
            System.out.println("reprovado:" + media);
         } else {

            System.out.println("exame:" + media);

        }

    }

            
    
}
    
