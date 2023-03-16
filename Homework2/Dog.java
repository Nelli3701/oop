public class Dog extends Pet implements Train {
    private boolean havingTraining;
    public Dog(double height, double weight, String eyesColour, String petName, String kind,
               boolean vaccination, String woolColour, String birthday, boolean havingTraining) {
        super(height, weight, eyesColour, petName, kind, vaccination, woolColour, birthday);
        this.havingTraining = havingTraining;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав");
    }

    @Override
    public void showAffection() {
        System.out.println("Просит играть");
    }

    @Override
    public void train() {
        System.out.println("Поддается дрессировке");
    }
    @Override
    public String toString() {
        return super.toString() + "наличие дрессировки: " + havingTraining;
    }
}
