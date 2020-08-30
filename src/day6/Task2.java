package day6;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("England", 2000, 30, 700);

        plane.setYearOfIssue(2010);
        plane.setLength(40);

        plane.fillUp(200);
        plane.fillUp(300);

        plane.info();
    }
}
