public class Childhood extends Product {
    protected int minAge;
    protected boolean hypoallergenic;
    public Childhood(String productName,double productPrice, int productAmount, String productUnit, int minAge, boolean hypoallergenic) {
        super(productName, productPrice, productAmount, productUnit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }
    @Override
    public String toString() {
        return super.toString() + "\nminAge: " + minAge + "\nhypoallergenic: " + hypoallergenic;
    }
}
