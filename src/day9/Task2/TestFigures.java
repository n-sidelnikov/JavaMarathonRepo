package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5),
        };
        System.out.println(calculateRedPerimeter(figures));
        System.out.println(calculateRedArea(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double amountPerimeter = 0;
        for (Figure figureArea : figures) {
            if (figureArea.getColor().equals("Red")) {
                amountPerimeter = amountPerimeter + figureArea.perimeter();
            }
        }
        return amountPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double amountArea = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                amountArea = amountArea + figure.area();
            }
        }
        return amountArea;
    }
}
