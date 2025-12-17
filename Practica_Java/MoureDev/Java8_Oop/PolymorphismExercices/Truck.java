package Java8_Oop.PolymorphismExercices;

public class Truck extends Vehicle {
    //Atributos


    //Constructor
    public Truck(String modelo) {
        super(modelo);
    }

    //Metodo
    @Override
    public void start(){
        System.out.println("El camion arranca");
    }

    public void describe(){
        System.out.println("Es un vehiculo "+getModel()+" de 6 ruedas color celeste");
    }
}
