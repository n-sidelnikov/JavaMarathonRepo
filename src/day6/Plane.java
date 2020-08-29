package day6;

public class Plane {
    private String producer;
    private int yearOfIssue;
    private int length;
    private int weight;
    private int fuelOfVolume = 0;

    public Plane(String producer, int yearOfIssue, int length, int weight) {
        this.producer = producer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
    }

    void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + yearOfIssue + ", длина: " + length + ", вес: " + weight);
    }

    int fillUp(int liters) {
        return liters + fuelOfVolume;
    }
}
