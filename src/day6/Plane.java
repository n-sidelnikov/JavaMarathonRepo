package day6;

public class Plane {
    private String producer;
    private int yearOfIssue;
    private int length;

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void setLength(int length) {
        this.length = length;
    }

    private int weight;
    private int fuelOfVolume = 0;

    public Plane(String producer, int yearOfIssue, int length, int weight) {
        this.producer = producer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
    }

   public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + yearOfIssue + ", длина: " + length + ", вес: " + weight + " обьем топлива в баке: " + fuelOfVolume);
    }

    public void  fillUp(int liters) {
        fuelOfVolume = liters + fuelOfVolume;
    }
}
