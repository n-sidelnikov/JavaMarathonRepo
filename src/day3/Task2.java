package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            double numberOne = scanner.nextDouble();
            double numberTwo = scanner.nextDouble();
            if(numberTwo == 0)
                break;
            System.out.println(numberOne / numberTwo);
        }
    }
}
