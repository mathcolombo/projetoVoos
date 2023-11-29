import java.util.ArrayList;
import java.util.Scanner;

public class MenuUsuario {

    private static Scanner scan = new Scanner(System.in);
    public static Voos voos = new Voos();
    

    public void exibirMenuComum() {
        int opcao;
        do {

            

            

            System.out.println("-------------Menu-------------");
            System.out.println("1 - Exibir Informações de Voo");
            System.out.println("2 - Realizar reserva");
            System.out.println("3 - Realizar checking");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1: //Informações dos voos

                    voos.infoVoos();
                    System.out.println();
                    System.out.println("---------------------------------------------------");

                    break;
                case 2: // Reserva
                    
                    System.out.println("Primeiro Realize o cadastro"); // informacoes dos passageiros
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

                    System.out.println("");
                    System.out.println("Voos disponíveis: ");
                    System.out.println("");

                    voos.ReservarVoo();

                    break;
                case 3: //Check-in

                    break;
                case 0:
                    System.out.println("Encerrando o menu do Usuário Comum.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
    
     public void exibirMenuAdmin() {
        int opcao;
        do {

            

            

            System.out.println("-------------Menu-------------");
            System.out.println("1 - Exibir Informações de Voo");
            System.out.println("2 - Autorizar Rezerva");
            System.out.println("3 - Realizar checking");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1: //Informações dos voos

                    voos.infoVoos();
                    System.out.println();
                    System.out.println("---------------------------------------------------");

                    break;
                case 2: // Reservas Pendentes 


                    break;
                case 3: //Check-in

            }
        } while (opcao != 0);
    }
}