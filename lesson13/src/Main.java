public class Main {
    public static void main(String[] args) {
        int stepQuantity = 500;
        double heightInMeters = 1.90;
        Paciente person = new Paciente();
        String name = "João";

        int heigthInCent = (int) heightInMeters * 100;

        if(stepQuantity < 1000) {
            String sugestion = "Sugiro que você tente aumentar a meta!";
            System.out.println(sugestion);
        }
//        sugestion = "Parabens";
    }
}