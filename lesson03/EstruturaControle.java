package ex_03;
import java.util.*;

public class EstruturaControle {
    public static int num;

    @SuppressWarnings("resource")
    public static void main(String args[]) {
        //input
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = teclado.nextInt();

        //Condicional
        if(num > 0){
            System.out.println("O Numero e Positivo");
        }
        if(num < 0){
            System.out.println("O numero e Negativo");
        }
        if(num == 0){
            System.out.println("O numero e ZERO");
        }
    }
}
