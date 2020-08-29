package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Петров Алексей Иванович", "математика");

        Student student = new Student("Иванов Антон Васильевич");
        teacher.estimateOfStudent(student);
    }
}
