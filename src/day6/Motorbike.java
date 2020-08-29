package day6;

public class Motorbike {
    private int yearOfIssue;

    void sayMotorbike() {
        System.out.println("Это мотоцикл");
    }

    int year(int year) {
        return year - this.yearOfIssue;
    }

    public Motorbike(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
