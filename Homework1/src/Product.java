public class Product {
    protected String productName;
    protected double productPrice;
    protected int productAmount;
    protected String productUnit;
    public Product (String productName,double productPrice, int productAmount, String productUnit) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productAmount = productAmount;
        this.productUnit = productUnit;
    }

    @Override
    public String toString(){
        return "productName: " + productName + "\nproductPrice: " + productPrice +
                "\nproductAmount: " + productAmount + "\nproductUnit: " + productUnit;
    }
}
