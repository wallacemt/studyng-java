package ex_01;
import java.util.*;

public class Exerciocio1 {
    //Atributos
    public static String nome, sobrenome, localNasc, raca, sexo;
    public static int idade, anoNascimento, contato;
    public static double peso, altura;

    //constante
    public static final String CPF = "11326037599";

    public static void main(String args[]){

        //input
        Scanner tecladoString = new Scanner(System.in);
        Scanner tecladoInt = new Scanner(System.in);

        //output
        System.out.println("-----CADASTRO-----");

        System.out.println("______________________________________");
        System.out.println("Digite seu nome: ");
        nome = tecladoString.nextLine();

        System.out.println("______________________________________");
        System.out.println("Digite seu sobrenome");
        sobrenome = tecladoString.nextLine();

        System.out.println("______________________________________");
        System.out.println("Digite Ano De Nascimento");
        anoNascimento = tecladoInt.nextInt();

        System.out.println("______________________________________");
        System.out.println("Digite seu Local de Nascimento: ");
        localNasc = tecladoString.nextLine();

        System.out.println("______________________________________");
        System.out.println("Digite sua Raça: ");
        raca = tecladoString.nextLine();

        System.out.println("______________________________________");
        System.out.println("Digite seu Sexo (M/F): ");
        sexo = tecladoString.nextLine();

        System.out.println("______________________________________");
        System.out.println("Digite seu Contato: ");
        contato = tecladoInt.nextInt();

        System.out.println("______________________________________");
        System.out.println("Digite sua Idade: ");
        idade = tecladoInt.nextInt();

        System.out.println("______________________________________");
        System.out.println("Digite seu Peso");
        peso = tecladoInt.nextFloat();

        System.out.println("______________________________________");
        System.out.println("Digite Sua altura");
        altura = tecladoInt.nextFloat();
        
        System.out.println("\n-----Confira os dados CADASTRADOS----- \n");
        
        //Confirmação dos dados
        System.out.println("Seu nome Completo é : " + nome + ' ' + sobrenome);
        System.out.println("Você nasceu em: " + localNasc + " no ano de " +  anoNascimento);

        System.out.println("Seu contato é: " + contato);
        System.out.println("Sua idade é: " + idade + " anos");

        System.out.printf("Seu peso é: %.1f%n", peso);
        System.out.printf("Sua altura é: %.2f%n", altura);
        System.out.println("CPF: " + CPF);

        System.out.println("##### DADOS CADASTRADOS COM SUCESSO #####");
        //Fechando o Scanner
        tecladoInt.close();
        tecladoString.close();
    }
}
