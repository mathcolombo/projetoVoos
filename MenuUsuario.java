import java.util.ArrayList;
import java.util.Scanner;

public class MenuUsuario {

    private static Scanner scan = new Scanner(System.in);
    public static Voos voos = new Voos();
    public static ReservasPendentes reservas = new ReservasPendentes();
    

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
            System.out.println("2 - Autorizar Reserva");
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
                case 2: 
                    reservas.liberarReservas();;
                    break;

                case 3: //Check-in

            }
        } while (opcao != 0);
    }
}