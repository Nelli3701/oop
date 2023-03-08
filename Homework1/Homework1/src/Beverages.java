public class Beverages extends Product {
    protected String volume;
    public Beverages(String productName,double productPrice, int productAmount, String productUnit, String volume) {
        super(productName, productPrice, productAmount, productUnit);
        this.volume = volume;
    }
    @Override
    public String toString() {
        return super.toString() + "\nvolume" + volume;
    }
}
