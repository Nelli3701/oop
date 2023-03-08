public class Diapers extends Childhood{
    private String size;
    private int minWeight;
    private int maxWeight;
    private String type;
    public Diapers(String productName,double productPrice, int productAmount, String productUnit, int minAge, boolean hypoallergenic, String size, int minWeight, int maxWeight, String type){
        super(productName, productPrice, productAmount, productUnit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }
    @Override
    public String toString() {
        return super.toString() + "\nsize: " + size +
                "\nminWeight: " + minWeight +  "\nmaxWeight: " + maxWeight +
                "\ntype: " + type;
    }
}
