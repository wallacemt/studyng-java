package ex_02;
import java.util.*;

public class CalculadoraProfessor {

    public static double r, area;
    //constante
    public static final double PI = 3.14;
    public static void main(String args[]) {
        //input
        Scanner teclado = new Scanner(System.in);

        System.out.println("CALCULANDO RAIO");

        System.out.println("Digite o valor: ");
        r = teclado.nextDouble();
        
        area = PI * (r*r);

        System.out.println("______________________________________");
        System.out.println("O valor do raio é: " + area);
    }
}
