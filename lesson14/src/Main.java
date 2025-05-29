public class Main {
    public static void main(String[] args) {
        String name = "maria";
        double salario = 2890.0;
        int numeroDependentes = 2;
        boolean isento = false;

        if (salario > 2259.20 && !isento) {
            double irrf = salario / 100 * 7.5;
            System.out.println("Valor Irrf: " + irrf);
        }else if(isento){
            System.out.println("Isento de IRRF!");
        }else{
            System.out.println("Ganha pouco, sem irrf!");
        }
    }
}