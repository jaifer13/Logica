import java.util.Scanner;

public class Exc06 {
     public static void main (String[]args){
            Scanner in =new Scanner(System.in);
            float nota1=0;
            float nota2=0;
            float media=0f;
            
            System.out.println("Digite as notas do aluno");
            nota1 = in.nextFloat();
            nota2=in.nextFloat();
            media=(nota1+nota2)/2;
            
            System.out.print(media );

            
            
     }
    
}
