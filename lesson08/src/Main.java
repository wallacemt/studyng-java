public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Sceen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incuidoNoPlano = true;
        System.out.println("Incuido no plano: " + incuidoNoPlano);

        double avaliacao = 8.1;
        System.out.println("Avaliação: " + avaliacao);

        String nomeDoFilme = "Top Gun: Maverick";
        System.out.println("Nome do filme: " + nomeDoFilme);

        double media = (9.2 + 8.1 + 7.8) / 3;
        System.out.println("Media: " + media);
        String sinopse;
        sinopse = """
                Filme: Top Gun: Maverick
                Ano de lançamento: 2022
                Incuido no plano: true
                Avaliação: 8.1
                Nome do filme: Top Gun: Maverick
                """;
        System.out.println(sinopse);

    }
}