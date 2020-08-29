package day6;

public class Car {
    private int yearOfIssue;

    void sayCar() {
        System.out.println("Это автомобиль");
    }

    int year(int year) {
        return year - this.yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
