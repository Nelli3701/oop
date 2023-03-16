public class Tiger extends WildAnimal{
    public Tiger(double height, double weight, String eyesColour, String area, String dateFound){
        super(height, weight, eyesColour, area, dateFound);
    }

    @Override
    public void makeSound() {
        System.out.println("Ррр!");
    }

    @Override
    public String toString() {
        return super.toString();}
}
