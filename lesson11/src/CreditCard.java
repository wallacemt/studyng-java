import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private double amount;
    private List<Compra> compras;

    public CreditCard(double limit) {
        this.limit = limit;
        this.amount = limit;
        this.compras = new ArrayList<>();
    }

    public boolean addBuy(Compra compra) {
        if (this.amount > compra.getAmount()) {
            this.amount -= compra.getAmount();
            this.compras.add(compra);
            return true;
        }

        return false;

    }

    public double getLimit() {
        return limit;
    }

    public double getSaldo() {
        return amount;
    }

    public List<Compra> getCompras() {
        return compras;
    }


}

