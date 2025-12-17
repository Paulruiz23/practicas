package Java8_Oop.AccessModifiersExercises;

public class Employee {
    //Atributo
    private double salary;

    //Constructor
    public Employee(double salary){
        this.salary=salary;
    }


    //Metodo
    public double getSalary(){
         return salary;
    }

    public void raiseSalary(double percent){
        if (percent>0){
            this.salary= salary+(salary*percent)/100;
            System.out.println("El aumento de "+percent+"% se aplico correctamente. Nuevo salario: "+salary);
        }else {
            System.out.println("Aumento invalido");
        }
    }

}