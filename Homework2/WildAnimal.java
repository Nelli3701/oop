public abstract class WildAnimal extends Animal{
    protected String area;
    protected String dateFound;
    public WildAnimal(double height, double weight, String eyesColour, String area, String dateFound){
        super(height, weight, eyesColour);
        this.area = area;
        this.dateFound = dateFound;
    }
    @Override
    public String toString() {
        return super.toString() + "\nместо обитания: " + area + "\nдата нахождения: " + dateFound;}


}
