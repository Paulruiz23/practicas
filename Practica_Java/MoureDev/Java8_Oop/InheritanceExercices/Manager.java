package Java8_Oop.InheritanceExercices;

public class Manager extends Employee{
    // Atributo
    private int department;

    //Constructor
    public Manager(String name, double salary,int department) {
        super(name, salary);
        this.setDepartment(department);

    }

    //Metodo


    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }




}
