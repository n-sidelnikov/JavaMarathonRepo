package day9.Task2;

import static java.lang.StrictMath.PI;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
