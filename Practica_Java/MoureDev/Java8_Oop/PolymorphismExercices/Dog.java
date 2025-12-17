package Java8_Oop.PolymorphismExercices;

public class Dog extends Animal {
    //Atributos


    //Constructor
    public Dog(String nombre) {
        super(nombre);
    }

    //Metodo
    @Override
        public String getType(){
        return "Perro";
    }

}
