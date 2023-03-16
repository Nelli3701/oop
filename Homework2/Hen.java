public class Hen extends Bird{
    public Hen(double height, double weight, String eyesColour, float flightAttitude) {
        super(height, weight, eyesColour, flightAttitude);
    }

    @Override
    public void makeSound() {
        System.out.println("Ко-ко-ко");
    }
    @Override
    public String toString() {
        return super.toString();}
}
