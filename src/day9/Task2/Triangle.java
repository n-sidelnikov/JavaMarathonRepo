package day9.Task2;

import static java.lang.Math.sqrt;

public class Triangle extends Figure {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, int sideA, int sideB, int sideC) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double area() {
        double halfP = perimeter() / 2;
        return sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));

    }

    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}
