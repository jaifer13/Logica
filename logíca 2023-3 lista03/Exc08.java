import java.util.Scanner;

public class Exc08 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int usuario=1234;
        int senha=9999;
        System.out.println(("informe usuario"));
        usuario=in.nextInt();
        if(usuario!=1234){
            System.out.println("usuario invalido");
        }else{
            System.out.println("digite a senha");
            senha=in.nextInt();
            if(senha!=9999){
                System.out.println("senha incorreta");

            }else{
                System.out.println("acesso permitido:");
            }
        }
        


    }
    
}
