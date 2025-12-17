package Java8_Oop.PolymorphismExercices;

public class Car extends Vehicle {

    //Atributos
    private int speed;

    //Constructor
    public Car(int speed, String modelo){
        super(modelo);
        this.setSpeed(speed);
    }

    //Metodo

    @Override
    public void start(){
        System.out.println("El carro arranca");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void accelerate(int amount){
        if (amount > 0){
            speed+=amount;

            if (speed<0){
                speed=0;
            }
        }
        else{
            System.out.println("Cantidad inválida");
        }
    }
    public void brake(int amount){
        if (amount > 0){
            speed-=amount;

            if(speed<0){
                speed=0;
            }
        }
        else {
            System.out.println("Cantidad inválida");
        }
    }
    public int getSpeed(){
        return speed;
    }
    @Override
    public void describe(){
        System.out.println("Es un vehiculo "+getModel()+" de 4 ruedas color blanco");
    }
}
