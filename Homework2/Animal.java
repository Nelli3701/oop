public abstract class Animal {
    public double height;
    public double weight;
    public String eyesColour;
    public Animal(double height, double weight, String eyesColour) {
        this.height = height;
        this.weight = weight;
        this.eyesColour = eyesColour;
    }

    public abstract void makeSound();
    @Override
    public String toString() {
        return "рост:" + height + "вес: " + weight + "цвет глаз: " + eyesColour;
    }

}
