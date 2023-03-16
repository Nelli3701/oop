public class Stork extends Bird {
    public Stork(double height, double weight, String eyesColour, float flightAttitude) {
        super(height, weight, eyesColour, flightAttitude);
    }

    @Override
    public void makeSound() {
        System.out.println("Трынь-трынь");
    }
    @Override
    public String toString() {
        return super.toString();}
}
