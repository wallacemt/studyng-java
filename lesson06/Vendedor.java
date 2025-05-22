package ex_06;

public class Vendedor extends Empregado{
    private Double comissao;
    public Vendedor(String nome, Double salario, Double comissao){
        super(nome, salario);
        this.comissao = comissao;
    }
    public void setComissao(Double comissao){
        this.comissao = comissao;
    }
    public Double getComissao(){
        return comissao;
    }
    public void calcSalario(){
        salario = salario + (salario*comissao);
    }
}
