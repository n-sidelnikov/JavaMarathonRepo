package day7;

public class Plane {
    private String producer;
    private int yearOfIssue;
    private int length;
    private int weight;

    public Plane(String producer, int yearOfIssue, int length, int weight) {
        this.producer = producer;
        this.yearOfIssue = yearOfIssue;
        this.length = length;
        this.weight = weight;
    }

    public static void planes(Plane plane1, Plane plane2) {
        if (plane1.length > plane2.length) {
            System.out.println("Первый самолет длиннее второго");
        } else if(plane1.length < plane2.length){
            System.out.println("Второй самолет длиннее первого");
        }
        else {
            System.out.println("Длина самолетов равна");
        }
    }
}
