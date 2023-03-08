public class Hygiene extends Product {
    protected int amount;

    public Hygiene(String productName,double productPrice, int productAmount, String productUnit, int amount) {
        super(productName, productPrice, productAmount, productUnit);
        this.amount = amount;
    }
    @Override
    public String toString() {
        return super.toString() + "\namount: " + amount;
    }
}
