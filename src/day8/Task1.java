package day8;

public class Task1 {
    public static void main(String[] args) {
        String number = "";
        long start1 = System.currentTimeMillis();
        for(int i = 0; i <= 20000; i++) {
            number = number + i + " ";
        }
        System.out.println(number);
        long finish1 = System.currentTimeMillis();
        long timeConsumedMillis1 = finish1 - start1;
        System.out.println(timeConsumedMillis1);

        StringBuilder stringBuilder = new StringBuilder();
        long start2 = System.currentTimeMillis();
        for(int i = 0; i <= 20000; i++) {
            stringBuilder.append(i + " ");
        }
        System.out.println(stringBuilder.toString());
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println(timeConsumedMillis2);
    }
}
