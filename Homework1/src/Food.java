public class Food extends Product {
    protected String bestBeforeDate;
    public Food(String productName,double productPrice, int productAmount, String productUnit, String bestBeforeDate) {
        super(productName, productPrice, productAmount, productUnit);
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public String toString() {
        return super.toString() + "\nbestBeforeDate: " + bestBeforeDate;
    }
}
