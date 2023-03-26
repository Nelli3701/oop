public class Square extends Rectangle{
    public Square(double sideA) throws Exception{
        super(sideA, sideA);
        this.sides.add(sideA);
        this.sides.add(sideA);
        this.sides.add(sideA);
        this.sides.add(sideA);
    }
    @Override
    public double getArea() {
        return Math.pow(this.sides.get(0), 2);
    }
}
