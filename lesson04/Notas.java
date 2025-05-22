package ex_04;
import java.util.*;

public class Notas {
    public static int nota;
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        //input
        Scanner teclado = new Scanner(System.in);
        System.out.println("[1]Mal\n[2]Mediocre\n[3]Suficiente\n[4]Bom\n[5]Exelente\n");
        System.out.println("Digite uma nota para o atendimento: ");
        nota = teclado.nextInt();
        
        //Condicional
        switch(nota){
            case 1:
                System.out.println("Nota 1 = Mal");
                break;
            case 2:
                System.out.println("Nota 2 = Mediocre");
                break;
            case 3:
                System.out.println("Nota 3 = Suficiente");
                break;
            case 4:
                System.out.println("Nota 4 = Bom");
                break;
            case 5:
                System.out.println("Nota 5 = Exelente");
                break;
            default:
                System.out.println("Digite um numero valido!");
        }
    }
}
