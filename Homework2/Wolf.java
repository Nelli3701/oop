public class Wolf extends WildAnimal{
    private boolean leader;
    public Wolf(double height, double weight, String eyesColour, String area, String dateFound, boolean leader){
        super(height, weight, eyesColour, area, dateFound);
        this.leader = leader;
    }

    @Override
    public void makeSound() {
        System.out.println("Ууууу!");
    }
    @Override
    public String toString() {
        return super.toString() + "\nвожак стаи: " + leader;
    }
}
