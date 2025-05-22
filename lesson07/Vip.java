package ex_07;

public class Vip extends Ingresso {
    public double valorAdicional = 20;

    public Vip(Double valorIngresso, Double valorAdicional){
        super(valorIngresso);
        this.valorAdicional = valorAdicional;
    }
    public Double getValorAdicional(){
        return valorAdicional;
    }
    public Double ingressoVip(){
        valorIngresso += valorAdicional;
        return valorIngresso;
    }
}
