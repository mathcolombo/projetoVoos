
import java.util.Scanner;



public class princ {

    public static int opcao = 9;
    public static Scanner scan = new Scanner(System.in);   
    public static Voos exibirInfoVoo = new Voos();
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

                    System.out.println("Inserir informações do usuário");
                    System.out.println("================================================");
                    System.out.println("Digite o nome do passageiro:");
                    String nome = scan.next();
                    System.out.println("================================================");
                    System.out.println("Digite a idade do passageiro:");
                    int idade = scan.nextInt();
                    System.out.println("================================================");
                    System.out.println("Digite o CPF do passageiro:");
                    String cpf = scan.next();
                    System.out.println("================================================");
                    System.out.println("Digite o email do passageiro:");
                    String email = scan.next();
                    System.out.println("================================================");
                    Passageiro passageiro = new Passageiro(nome, idade, cpf, email);

                    MenuUsuarioComum menuUsuario = new MenuUsuarioComum(scan);
                    menuUsuario.exibirMenu();

                    break;

                case 2: //Roda o menu admin - caso passe na validação 
                    Boolean x = validar.ValidacaoAdmin();
                    
                    if(x = true) {
                        System.out.println("Usuário -> ADMINISTRADOR");

                    } else {break;}
            }
            
        } while(opcao != 0);
    }
}
