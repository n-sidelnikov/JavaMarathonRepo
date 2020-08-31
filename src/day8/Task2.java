package day8;

public class Task2 {
    public static void main(String[] args) {
        Plane plane = new Plane("England", 2010, 50, 1000);
        StringBuilder builder = new StringBuilder();

        builder.append("Изготовитель: " + plane.getProducer()).append(", год выпуска: ").append(plane.getYearOfIssue()).append(", длина: ").append(plane.getLength()).append(", вес: ").append(plane.getWeight()).append(", обьем топлива в баке: ").append(plane.getFuelOfVolume());
        System.out.println(builder.toString());
    }
}
