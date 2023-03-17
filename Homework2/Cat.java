public class Cat extends Pet{
    private boolean havingWool;

    public Cat(double height, double weight, String eyesColour, String petName, String kind,
               boolean vaccination, String woolColour, String birthday, boolean havingWool) {
        super(height, weight, eyesColour, petName, kind, vaccination, woolColour, birthday);
        this.havingWool = havingWool;
    }
    @Override
    public void makeSound() {
        System.out.println("Мяу");
    };

    @Override
    public String toString() {
        return super.toString() + "\nналичие шерсти: " + havingWool;
    }

    @Override
    public void showAffection() {
        System.out.println("Привлекает внимание");
    }
}
