import java.util.ArrayList;
import java.util.Arrays;

public class Voos {

    public static ArrayList<ArrayList<Object>> InfoVoos() { // posição : 0 = número do avião / 1 = origem / 2 = destino / 3 horário de partida / 4 = horário de chegada / 5 = quantidade máx de passageiros

        ArrayList<Object> av1 = new ArrayList<>(Arrays.asList(2904, "São Paulo", "Espírito Santo", "13:00", "17:00", 100));
        ArrayList<Object> av2 = new ArrayList<>(Arrays.asList(3650, "Madri", "Cariacica", "13:00", "17:00", 100));

        ArrayList<ArrayList<Object>> voos = new ArrayList<>();
        voos.add(av1);
        voos.add(av2);

        for(Object item : voos) {
            System.out.println(item);
        }

        return voos;
    }
}
