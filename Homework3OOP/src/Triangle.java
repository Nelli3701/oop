import java.util.ArrayList;

public class Triangle extends Polygon {
    public Triangle(double sideA, double sideB, double sideC) throws Exception{
        super(sideA, sideB, sideC);
        this.sides.add(sideA);
        this.sides.add(sideB);
        this.sides.add(sideC);
        if ((sideA + sideB < sideC) || (sideA + sideC < sideB) || (sideB + sideC < sideA)){
                throw new Exception("Треугольник с такими сторонами не может существовать.");
            }

    }
    @Override
    public double getArea() {
        double halfP = getPerimeter(this.sides) / 2;
        return Math.sqrt(halfP * ((halfP - this.sides.get(0)) * (halfP - this.sides.get(1)) * (halfP - this.sides.get(2))));
    }
}
