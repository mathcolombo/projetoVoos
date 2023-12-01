import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ReservasPendentes {

    public static Scanner scan = new Scanner(System.in);
    public static Queue<String> reservasCpf = new LinkedList<>();

    public Void FilaReservasCpf(String cpfTemp) { 

        reservasCpf.add(cpfTemp);
        for(int c = 0 ; c < reservasCpf.size() ; c++) {
            System.out.println("Reserva " + c + "->" + ((LinkedList<String>) reservasCpf).get(c));
        }

        return null;
    }

    public void liberarReservas() {

        System.out.println("Deseja liberar a reserva do CPF - " + ((LinkedList<String>) reservasCpf).get(0));
        System.out.println("[ 1 ] SIM - [ 2 ] NÃO");
        int opc = scan.nextInt();

        if(opc == 1) {
            reservasCpf.remove();

        } else {
            System.out.println("Reservas mantidas");
        }

    
        System.out.println(reservasCpf);
    }
}
