package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.sayCar();
        car.setYearOfIssue(2000);
        int numberOfCar = car.year(5000);
        System.out.println(numberOfCar);

        Motorbike motorbike = new Motorbike(2010);
        motorbike.sayMotorbike();
        int numberOfMotorbike = motorbike.year(3000);
        System.out.println(numberOfMotorbike);
    }
}

