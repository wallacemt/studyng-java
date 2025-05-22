package ex_06;

public class Gerente extends Empregado {
    private String departamento;
    public Gerente(String departamento, String nome, Double salario){
        super(nome, salario);
        this.departamento = departamento;
    }
    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

}
