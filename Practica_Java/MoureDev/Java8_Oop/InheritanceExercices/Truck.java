package Java8_Oop.InheritanceExercices;

public class Truck extends Vehicle{
    //Atributos


    //Constructor
    public Truck(String modelo) {
        super(modelo);
    }

    //Metodo

    public void describe(){
        System.out.println("Es un vehiculo "+getModel()+" de 6 ruedas color celeste");
    }
}
