package day7;

public class Task1 {
    public static void main(String[] args) {
        Plane plane1 = new Plane("Russia", 2000, 50, 800);
        Plane plane2 = new Plane("America", 2015, 30, 900);
        Plane.planes(plane1, plane2);
    }
}
