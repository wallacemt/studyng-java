package ex_07;

public class IngressoNormal extends Ingresso {
    public static double ingressoNormal;
    
    public IngressoNormal(Double valorIngresso) {
        super(valorIngresso);
    }
    public void imprimirIngressoNormal(){
        System.out.println(ingressoNormal);
    }
}
