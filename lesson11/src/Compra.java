public class Compra implements Comparable<Compra> {
    private String description;
    private double amount;

    public Compra(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("Compra: description='%s', amount=%.2f", description, amount);
    }

    @Override
    public int compareTo(Compra outherBuy) {
        return Double.valueOf(this.amount).compareTo(Double.valueOf(outherBuy.getAmount()));
    }
}
