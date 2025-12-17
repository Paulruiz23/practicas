package Java8_Oop.InheritanceExercices;

public class Employee {
    //Atributo
    private double salary;
    private String name;

    //Constructor
    public Employee(String name,double salary){
        this.salary=salary;
        this.setName(name);
    }


    //Metodo
    public double getSalary(){
         return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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