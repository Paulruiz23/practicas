package Java8_Oop.InheritanceExercices;

public class Cat extends Animal{
    //Atributos


    //Constructor
    public Cat(String nombre) {
        super(nombre);
    }

    //Metodo
    @Override
    public void makeSound(){
        System.out.println("El "+getNombre()+ " hace meow");
    }

}
