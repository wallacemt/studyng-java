package ex_05;
import java.util.*;
public class Lacos {
    public static int i = 0;
    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        i = teclado.nextInt();

        while(0 <= i){
             System.out.println("i = " + i);
             i--;
         }
        // int x;
        // for(x = 1; x <= 100; x++){
        //     System.out.println("x = " + x);
        // }
    }
}
