import java.util.Scanner;

public class Lista0213 {
    public static void main(String[]args){
        Scanner in= new Scanner(System.in);
        float nota1;
        float nota2; 
        float media;
        System.out.println("INFORME NOTA1 E NOTA2:");
        nota1=in.nextFloat();  
        nota2=in.nextFloat();
        media=(nota1+nota2)/2;
          if(media>=6){
          System.out.println("RESULTADO APROVADO:" +media );
        } else{                                                                                                         
          System.out.println("RESULTADO REPROVADO:"+media);
        }

    }        

}
