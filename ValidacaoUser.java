import java.util.Scanner;

public class ValidacaoUser {

    public static Scanner scan = new Scanner(System.in); 
    public static String user = "admin";
    public static int pass = 123;


    public static boolean validacaoAdmin() {
        String usuario = "";
        int senha = 0;

        System.out.print("Insira o Usuário:");
        usuario = scan.next();

        if(usuario.equals(user)) {
                System.out.print("Digite a Senha:");
                senha = scan.nextInt();

            if(senha == pass) {
                System.out.println("Você entrou");
                return true;

            } else {
                System.err.print("Senha incorreta");

            }
        } else {System.err.println("Admin não encontrado");}

        return false;
    }
}