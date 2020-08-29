package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("England", 2000, 30, 700);
        plane.info();
        int fullTank = plane.fillUp(300);
        System.out.println(fullTank);
    }
}
