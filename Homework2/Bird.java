public abstract class Bird extends Animal implements Fly{
    private float flightAttitude;
    public Bird(double height, double weight, String eyesColour, float flightAttitude){
            super(height, weight, eyesColour);
            this.flightAttitude = flightAttitude;
    }
    @Override
    public void fly() {
        System.out.printf("Я летаю на %f метров", this.flightAttitude);
        }
    @Override
    public String toString() {
        return super.toString() + "\nвысота полёта: " + flightAttitude;
    }
}
