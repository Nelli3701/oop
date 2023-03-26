public class Circle extends Figure implements Circumference {
    protected double radius;
    public Circle(double radius) throws Exception{
        this.radius = radius;
        if (radius < 0)
            throw new Exception("Круг с таким радиусом не может существовать.");
    }
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*this.radius;
    }
    @Override
    public String toString() {
        return super.toString() +
                ", " + "Радиус: " + radius +
                ", " + "Длина окружности: " + this.getCircumference();
    }


}
