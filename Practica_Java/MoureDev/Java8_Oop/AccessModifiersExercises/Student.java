package Java8_Oop.AccessModifiersExercises;

public class Student {
    //Atributo
    private int grade;

    //Constructor
    public Student(int grade) {
        this.setGrade(grade);
    }

    //Metodo
    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        if (grade >= 60) {
           return true;
        } else {
            return false;
        }
    }

}
