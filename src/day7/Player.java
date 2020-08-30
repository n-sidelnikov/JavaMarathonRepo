package day7;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    static int counter;
    static int free;

    Player() {
        counter++;
        stamina = (int) (Math.random() * (MAX_STAMINA - 90 + 1)) + 90;
        if (counter > 6) {
            counter = 6;
        }
    }

    static void info() {
        free = 6 - counter;
        if (counter == 6) {
            System.out.println("Мест в командах больше нет.");
        } else {
            System.out.println("Команды неполные, ещё есть свободных мест: " + free);
        }
    }

    void run() {
        stamina--;
        if (stamina == MIN_STAMINA) {
            System.out.println("Игрок устал и покидает поле");
            counter--;
        }
    }
}
