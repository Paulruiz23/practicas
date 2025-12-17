package Java8_Oop.PolymorphismExercices;

public class Bird extends Animal {

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

    @Override
    public String getType(){
        return "Bird";
    }


}



