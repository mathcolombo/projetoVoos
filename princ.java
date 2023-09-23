package projetoVoos;
import java.util.Scanner;

public class princ {
    private static int opcao = 9;
    private static String user = "admin";
    private static int pass = 123;
    private static Scanner scan = new Scanner(System.in);   

    public static void main(String[] args) {
        do {

          System.out.println("Selecione com que tipo de usuário entrar");
          System.out.println("1 - Cliente");
          System.out.println("2 - Administrador");
          System.out.println("0 - Encerrar Programa");
          opcao = scan.nextInt();
          
          switch(opcao){          
            case 1: //Roda o menu de usuário
                    break;

            case 2: //Roda o menu admin - caso passe na validação 
                ValidacaoAdmin();
                break;         
          }
           
        } 
        while(opcao != 0);
    }

    //Subprograma que valida se o usuário realmente é um ADM
    public static int ValidacaoAdmin() {
        String usuario = "";
        int senha = 0;

        System.out.print("Insira o Usuário:");
        usuario = scan.next();

        if(usuario.equals(user)) {
                System.out.print("Digite a Senha:");
                senha = scan.nextInt();

            if(senha == pass) {
                System.out.println("Você entrou");
                return 2;

            } else {
                System.err.print("Senha incorreta");

            }
        } else {System.err.println("Admin não encontrado");}

        return 0;
    }

    public static int Voos() {
        return 0;
    }
}
