package Java8_Oop.AbstractionExercices;

public class Bike extends Vehicle {

    //Atributos

    //Constructor
    public Bike(String modelo) {
        super(modelo);
    }

    //Metodo
    @Override
    public void start(){
        System.out.println("La bicicleta arranca");
    }

    public void describe(){
        System.out.println("Es un Vehiculo "+getModel()+" de 2 ruedas color azul");
    }
}
