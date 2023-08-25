import java .util.Scanner;

import java .util.Calendar;
import java.util.Date;
    public class Lista0214 {
        public static void main(String[] args) {
            Calendar hoje= Calendar.getInstance();
            int ano =hoje.get(Calendar.YEAR);
            int anonacimento;
            int resultado;
            Scanner in=new Scanner(System.in);
            System.out.println("ANO DE NACIMENTO:");
            anonacimento=in.nextInt();
            resultado= ano-anonacimento;
              if(resultado>=18){
              System.out.println("PODE VOTAR:");
           } else{                        
              System.out.println("NAO VOTA:");
           }
    
    
    
    
        }

 }
         

















    
