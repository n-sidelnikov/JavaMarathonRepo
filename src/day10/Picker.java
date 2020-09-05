package day10;

public class Picker implements Worker {
    private int salary;
    private Warehouse warehouse;

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void doWork() {
        salary = salary + 100;
       warehouse.setCountOrders(warehouse.getCountOrders() + 1);
    }

    @Override
    public void bonus() {
        if(warehouse.getCountOrders() > 1500) {
            salary = salary * 3;
        }
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                '}';
    }
}
