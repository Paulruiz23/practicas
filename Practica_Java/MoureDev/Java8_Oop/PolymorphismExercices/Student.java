package Java8_Oop.PolymorphismExercices;

public class Student extends Person {
    //Atributo
    private int grade;

    //Constructor
    public Student(int grade, String name, int age){
        super(name,age);
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
    public void study(){
        System.out.println("El joven "+getName()+" de "+getAge()+" años está estudiando y tiene una nota de: "+grade);
    }

}
