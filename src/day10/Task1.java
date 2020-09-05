package day10;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(picker + " " + courier + " " + warehouse);
        picker.doWork();
        courier.doWork();
        System.out.println(picker + " " + courier + " "  + warehouse);

        for( int i = 1; i <= 1500; i++) {
            picker.doWork();
            courier.doWork();
        }
        picker.bonus();
        courier.bonus();
        System.out.println(picker + " " + courier + " " + warehouse);
    }
}
