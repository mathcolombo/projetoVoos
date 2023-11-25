import java.util.ArrayList;
import java.util.Scanner;

public class MenuUsuarioComum {

    private static Scanner scan = new Scanner(System.in);
    public static Voos exibirInfoVoo = new Voos();
    

    public void exibirMenu() {
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
                case 1:

                    System.out.println("---------------------------------------------------");
                    System.out.println();
                    System.out.println(" Da esquerda para direita a ordem é: número do avião, origem ,destino ,horário de partida , horário de chegada, quantidade máx de passageiros");
                    System.out.println();                
                    System.out.println();
                    ArrayList<ArrayList<Object>> resultadoExibir = exibirInfoVoo.InfoVoos();
                    System.out.println();
                    System.out.println("---------------------------------------------------");

                    break;
                case 2:
                    
                    System.out.println("Para realizar uma reserva é necessário realizar o cadastro!!");
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


                    break;
                case 3:

                    break;
                case 0:
                    System.out.println("Encerrando o menu do Usuário Comum.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }
}