package Java8_Oop.InheritanceExercices;

public class Bike extends Vehicle {

    //Atributos

    //Constructor
    public Bike(String modelo) {
        super(modelo);
    }

    //Metodo

    public void describe(){
        System.out.println("Es un Vehiculo "+getModel()+" de 2 ruedas color azul");
    }
}
