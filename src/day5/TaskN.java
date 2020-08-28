package day5;

public class TaskN {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Kia");
        car.setColor("White");
        car.setYearOfIssue(2010);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getYearOfIssue());

        Motorbike motorbike = new Motorbike("Honda", "Black", 2020);
    }
}
