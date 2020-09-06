package day11;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        list.add("Volvo");
        list.add("Bmw");
        list.add("Infinity");
        list.add("Chevrolet");
        list.add("Tesla");
        System.out.println(list);

        list.add(2, "Reno");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);
    }
}
