import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Voos {

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<ArrayList<Object>> voos = new ArrayList<>();
    public static ArrayList<Object> av1 = new ArrayList<>(Arrays.asList("2904", "São Paulo", "Espírito Santo", "13:00", "17:00", 100));
    public static ArrayList<Object> av2 = new ArrayList<>(Arrays.asList("3650", "Madri", "Cariacica", "13:00", "17:00", 100));



    public static ArrayList<ArrayList<Object>> InfoVoos() { // posição : 0 = número do avião / 1 = origem / 2 = destino / 3 horário de partida / 4 = horário de chegada / 5 = quantidade máx de passageiros

        voos.add(av1);
        voos.add(av2);

        for(int c = 0 ; c < voos.size() ; c++) {
            System.out.println("");

            for(int x = 0 ; x < voos.get(c).size() ; x++) {
                System.out.print(voos.get(c).get(x) + ", ");
            }
        }

        return voos;
    }

    public static String ReservarVoo() {

        voos.add(av1);
        voos.add(av2);

        System.out.print("Digite o número do voo que deseja reservar: ");
        Object numVoo = scan.next();
        for(int c = 0 ; c < voos.size() ; c++) {
            if((voos.get(c).get(0)) == numVoo) {
                System.out.println("Deu certo");
            }
        }


        return "a";
    }
}
