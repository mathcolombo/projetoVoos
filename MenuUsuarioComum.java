import java.util.ArrayList;
import java.util.Scanner;

public class MenuUsuarioComum {

    private Scanner scanner;

    public MenuUsuarioComum(Scanner scanner) {
        this.scanner = scanner;
    }

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

            opcao = scanner.nextInt();

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