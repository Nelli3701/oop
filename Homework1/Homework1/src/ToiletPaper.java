public class ToiletPaper extends Hygiene {
    private int numberOfLayers;

    public ToiletPaper(String productName,double productPrice, int productAmount, String productUnit, int amount, int numberOfLayers) {
        super(productName, productPrice, productAmount, productUnit, amount);
        this.numberOfLayers = numberOfLayers;
    }
    @Override
    public String toString() {
        return super.toString() + "\nnumberOfLayers: " + numberOfLayers;
    }
}
