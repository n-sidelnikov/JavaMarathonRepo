package day6;

public class Teacher {
    private String fio;
    private String thing;

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public Teacher(String fio, String thing) {
        this.fio = fio;
        this.thing = thing;
    }

    void estimateOfStudent(Student fio) {
        int estimate = (int) (2 + Math.random() * 6);
        String estimateText = "";
        switch (estimate) {
            case 2:
                estimateText = "неудовлетворительно";
                break;
            case 3:
                estimateText = "удовлетворительно";
                break;
            case 4:
                estimateText = "хорошо";
                break;
            case 5:
                estimateText = "отлично";
                break;
        }

        System.out.println("Преподаватель " + getFio() + " оценил студента по имени " + fio.getFio() + " по предмету " + getThing() + " на оценку " + estimateText);
    }
}
