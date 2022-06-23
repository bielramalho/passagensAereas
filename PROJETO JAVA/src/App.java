import java.util.Scanner;
import funçoes.Func;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
            int opc=0;
            do {
                System.out.println("\n\nVENDA DE PASSAGENS AEREAS\n");
                System.out.println("1- EXIBIR DESTINOS");
                System.out.println("2- PLANEJAR VIAGEM");
                System.out.println("0- SAIR");
                System.out.print("\nESCOLHA UMA OPÇÃO: ");
                opc = sc.nextInt();
    
                switch (opc) {
                    case 1:
                    Func.exibirDestinos();
                    break;
                    case 2:
                    Func.planejarViagem();
                    break;
                }
            } while (opc != 0);
            sc.close();
        
    }

}
