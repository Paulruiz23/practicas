package Java8_Oop.PolymorphismExercices;

public class Cat extends Animal {
    //Atributos


    //Constructor
    public Cat(String nombre) {
        super(nombre);
    }

    //Metodo

    @Override
    public String getType(){
        return "Cat";
    }

    @Override
    public void makeSound(){
        System.out.println("El "+getNombre()+ " hace meow");
    }

}
