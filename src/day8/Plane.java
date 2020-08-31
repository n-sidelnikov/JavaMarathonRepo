package day8;

public class Plane {
    private String producer;
    private int yearOfIssue;
    private int length;
    private int weight;
    private int fuelOfVolume = 0;

    public String getProducer() {
        return producer;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuelOfVolume() {
        return fuelOfVolume;
    }

    public Plane(String producer, int yearOfIssue, int length, int weight) {
        this.producer = producer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
    }

   public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + yearOfIssue + ", длина: " + length + ", вес: " + weight + " обьем топлива в баке: " + fuelOfVolume);
    }
}
