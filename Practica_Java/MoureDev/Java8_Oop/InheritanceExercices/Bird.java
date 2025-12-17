package Java8_Oop.InheritanceExercices;

public class Bird extends Animal{

    //Atributos


    //Constructor
    public Bird(String nombre) {
        super(nombre);
    }


    //Metodo
    public void fly(){
        System.out.println("El ave esta volando");
    }

    public void makeSound() {
        System.out.println("El "+getNombre()+" hace Chirp");
    }
}
