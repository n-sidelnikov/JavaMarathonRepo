package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иван", "ИП11");
        System.out.println(student.getGroupName());
        student.printInfo();

        Teacher teacher = new Teacher("Татьяна Николаевна", "География");
        System.out.println(teacher.getObject());
        teacher.printInfo();
    }
}
