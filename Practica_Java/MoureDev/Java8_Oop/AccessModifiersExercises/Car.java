package Java8_Oop.AccessModifiersExercises;

public class Car {

    //Atributos
    private int speed;

    //Constructor
    public Car(int speed){
        this.setSpeed(speed);
    }

    //Metodo

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
}
