package Java8_Oop.PolymorphismExercices;

public class Vehicle {
    //Atributos
    private String modelo;

    //Constructor
    public Vehicle(String modelo){
        this.setModel(modelo);
    }

    //Metodo

    public void start(){
        System.out.println("El vehiculo arranca");
    }

    public String getModel() {
        return modelo;
    }
    public void setModel(String modelo){
        this.modelo=modelo;
    }

    public void move(){
        System.out.println("El carro modelo: "+modelo+" se mueve");
    }
    public void honk(){
        System.out.println("El carro modelo: "+modelo+" hace sonar su bocina");
    }
    public void describe(){
        System.out.println("Es un vehiculo");
    }

}
