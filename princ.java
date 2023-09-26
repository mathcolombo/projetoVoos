import java.util.Scanner;

public class Princ {

    public static int opcao = 9;
    public static Scanner scan = new Scanner(System.in);   
    public static Voos exibir = new Voos();
    public static ValidacaoUser validar = new ValidacaoUser();

    public static void main(String[] args) {

        do {

            System.out.println("Selecione com que tipo de usuário entrar");
            System.out.println("1 - Cliente");
            System.out.println("2 - Administrador");
            System.out.println("0 - Encerrar Programa");
            opcao = scan.nextInt();

            switch(opcao){          
                case 1: //Roda o menu de usuário
                    System.out.println(exibir.InfoVoos());
                    break;

                case 2: //Roda o menu admin - caso passe na validação 
                    validar.ValidacaoAdmin();
                    break;         
            }
            
        } while(opcao != 0);
    }
}
