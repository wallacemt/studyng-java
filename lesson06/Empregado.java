package ex_06;

public class Empregado {
    protected String nome;
    protected Double salario;
    public Empregado(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public String toSalario(){
        return nome + " " + salario;
    }
}