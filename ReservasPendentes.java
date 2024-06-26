import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class ReservasPendentes {

    public static Scanner scan = new Scanner(System.in);

    public static Queue<String> reservasCpf = new LinkedList<>();

    public static ArrayList<String> cpfsLiberados = new ArrayList<String>();

    public static Stack<String> checkinsFeitos = new Stack<>(); 

    //Método para solicitar a reserva
    public Void FilaReservasCpf(String cpfTemp) { 

        reservasCpf.add(cpfTemp); //Adiciona o cpf da lista temporária a lista definitiva
        
        System.out.println("");
        System.out.println("Reserva solicitada com sucesso!" );
        System.out.println("");
        

        return null;
    }

    //Método para a liberação de reservas feitas
    public void liberarReservas() {

        System.out.println("Deseja liberar a reserva do CPF - " + ((LinkedList<String>) reservasCpf).get(0)); //Casting de conversão para uma lista encadeada do tipo String
        System.out.println("[ 1 ] SIM - [ !1 ] NÃO");
        int opc = scan.nextInt();

        if(opc == 1) {
            cpfsLiberados.add(reservasCpf.remove()); // Adiciona os cpfs já liberados na reserva a uma lista temporária

        } else {
            System.out.println("Reservas mantidas");
        }

        System.out.println("Reservas restantes");
        for(int c = 0 ; c < reservasCpf.size() ; c++) {
            System.out.println("Reserva " + c + " -> " + ((LinkedList<String>) reservasCpf).get(c));
        }

    }

    //Método do checkin
    public void checkin() {

        System.out.print("Digite o cpf usado no momento das reservas: ");
        String cpfDigitado = scan.next();

        //Loop para varrer a lista de cpfs que fizerem as reservas
        for(int c = 0 ; c <cpfsLiberados.size() ; c++) {

            //Caso o cpf seja igual ao digitado pelo cliente, é feito o checkin
            if(cpfsLiberados.get(c).equals(cpfDigitado)) {
                checkinsFeitos.push(cpfsLiberados.remove(c));

            } else {
                System.out.println("Número de CPF não registrados no sistema");
            }
        }

        System.out.println(checkinsFeitos);
        System.out.println(cpfsLiberados);
    }
}
