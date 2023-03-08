public class Eggs extends Food {
    private int amountInPackage;
    public Eggs(String productName, double productPrice, int productAmount, String productUnit, String bestBeforeDate, int amountInPackage) {
        super(productName, productPrice, productAmount, productUnit, bestBeforeDate);
        this.amountInPackage = amountInPackage;
    }
    @Override
    public String toString() {
        return super.toString() + "\namountInPackage: " + amountInPackage;
    }
}
