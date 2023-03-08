public class Milk extends Food{
    private double fatPercentage;
    public Milk(String productName, double productPrice, int productAmount, String productUnit, String bestBeforeDate) {
        super(productName, productPrice, productAmount, productUnit, bestBeforeDate);
        this.fatPercentage = fatPercentage;
    }
    @Override
    public String toString() {
        return super.toString() + "\nfatPercentage: " + fatPercentage;
    }
}
