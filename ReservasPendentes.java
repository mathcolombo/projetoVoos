import java.util.LinkedList;
import java.util.Queue;


public class ReservasPendentes {

    public static Passageiro infPassageiro = new Passageiro(null, 0, null, null);


    public void FilaDasReservasPendentes() {
        
        
        String numerocpf = infPassageiro.getCpf();
        Queue<String> valoresCpf = new LinkedList<>(); 
        valoresCpf.add(numerocpf);

        return ;
    }
    
        
}
