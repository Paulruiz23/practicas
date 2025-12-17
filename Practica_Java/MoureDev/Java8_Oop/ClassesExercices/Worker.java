package Java8_Oop.ClassesExercices;

public class Worker {
    //Atributo
    String nombre;
    int salario;

    //Constructor
    public Worker(String nombre , int salario){
    this.nombre = nombre;
    this.salario = salario;

    }

    //Metodo
    public void mostrarSalario(){
        System.out.println("El salario de "+nombre+" es "+salario+".");
    }
}
