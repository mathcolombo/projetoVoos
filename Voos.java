import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Voos {

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<Integer> contReservas = new ArrayList<>();

    public static ArrayList<ArrayList<Object>> voos = new ArrayList<>();
    public static ArrayList<Object> av1 = new ArrayList<>(Arrays.asList("1000", "São Paulo", "Espírito Santo", "13:00", "17:00", 100));
    public static ArrayList<Object> av2 = new ArrayList<>(Arrays.asList("2000", "Madri", "Cariacica", "13:00", "17:00", 1));
    public static ArrayList<Object> av3 = new ArrayList<>(Arrays.asList("3000", "Rio de Janeiro", "Santa Catarina", "13:00", "17:00", 100));

    public Voos() {

        if(voos.size() == 0) {
            voos.add(av1);
            voos.add(av2);
            voos.add(av3);

            for(int c = 0 ; c < voos.size() ; c++) {
                contReservas.add(0);
            }
        }

    }

    public static ArrayList<ArrayList<Object>> infoVoos() { // posição : 0 = número do avião / 1 = origem / 2 = destino / 3 horário de partida / 4 = horário de chegada / 5 = quantidade máx de passageiros

        for(int c = 0 ; c < voos.size() ; c++) {
            System.out.println("");

            for(int x = 0 ; x < voos.get(c).size() ; x++) {
                System.out.print(voos.get(c).get(x) + ", ");
            }
        }

        return voos;
    }

    //Método de reserva de voos
    public static String ReservarVoo() {

        //Loop para apresentar os voos de forma formatada
        for(int c = 0 ; c < voos.size() ; c++) {
            System.out.println("[" + c + "]" + " - Voo: " + voos.get(c).get(0) + " - Origem: " + voos.get(c).get(1) + " - Destino: " + voos.get(c).get(2));
        }

        System.out.print("Deseja reservar qual Voo?");
        int opcao = scan.nextInt();
        int quantReservasTemp = (int)contReservas.get(opcao); //Inicializando a variável que auxiliará a saber a quantidade de reservas ja feita

        //If que monitora se a quantidade de reservas do voo ja foi excedida, caso sim, não permite reservá-lo
        if(quantReservasTemp >= (int)voos.get(opcao).get(5)) {
            System.out.println("Lamentamos mas o voo está lotado, favor escolher outro voo");

        } else {

            quantReservasTemp = (int)contReservas.get(opcao) + 1;
            contReservas.set(opcao, quantReservasTemp++); //Adiciona mais uma reserva no voo escolhido
        }

        System.out.println(contReservas);
        return "a";
    }

}
