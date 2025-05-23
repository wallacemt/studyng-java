public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 2022;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";
        double notaDoFilme = 8.1;

        if(anoLancamento >= 2022){
            System.out.println("Filme novo.");
        }else{
            System.out.println("Filme retro.");
        }
        if(incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme pode ser visto.");
        }else{
            System.out.println("Filme nao pode ser visto.");
        }

    }
}
