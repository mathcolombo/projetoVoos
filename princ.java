package projetoVoos;
import java.util.Scanner;


public class princ {
   public static int opcao = 9;
   public static int user = 1;
   public static int pass = 123;
   public static Scanner scan = new Scanner(System.in);

    
    public static void main(String[] args) {
        do {
          System.out.println("Selecione com que tipo de usuario entrar");
          System.out.println("1 - Usuário");
          System.out.println("2 - Administrador (Senha necessário)");
          System.out.println("0 - Encerrar Programa");
          opcao = scan.nextInt();
          
          switch(opcao){
          
              case 1:
                  //roda o menu  de ususário
                      break;
              case 2:
                  int usuario = 0;
                  int senha = 0;
                  System.out.print("Insira o Usuario:");
                  usuario = scan.nextInt();
                  if (usuario == user)
                  {
                      System.out.print("Digite a Senha:");
                      senha = scan.nextInt();
                      if (senha == pass) {
                          System.out.println("Você entrou");
                          //Aqui rodaria o menu de Admin
                      } else
                      {
                          System.err.print("Senha incorreta");
                      }
                  }
                  else {System.err.println("Admin não encontrado");}
                      break;
          
          
          }
           
           } 
        while (opcao != 0);
    }
}
