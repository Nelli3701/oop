public class Bread extends Food {
    private String flourType;
    public Bread(String productName, double productPrice, int productAmount, String productUnit, String bestBeforeDate, String flourType) {
        super(productName, productPrice, productAmount, productUnit, bestBeforeDate);
        this.flourType = flourType;
    }
    @Override
    public String toString() {
        return super.toString() + "\nflourType: " + flourType;
    }
}
