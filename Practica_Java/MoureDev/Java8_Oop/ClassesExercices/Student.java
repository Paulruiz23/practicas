package Java8_Oop.ClassesExercices;

public class Student {
    //Atributo
    int Score;

    //Constructor
    public Student(int Score){
        this.Score=Score;
    }

    //Metodo
    public void nota(){
        if (Score>=60){
            System.out.println("El estudiante aprobó con una nota de: " + Score);
        }else {
            System.out.println("El estudiante desaprobó con un nota de: "+Score);
        }
    }


}
