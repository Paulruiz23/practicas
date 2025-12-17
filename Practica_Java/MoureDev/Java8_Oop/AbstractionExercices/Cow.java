package Java8_Oop.AbstractionExercices;


public class Cow extends Animal {
    //Atributos



    //Constructor
    public Cow(String nombre) {
        super(nombre);
    }


    //Metodo
    @Override
    public String getType(){
        return "Cow";
    }

    @Override
    public void makeSound(){
        System.out.println("La "+getNombre()+" hace muu!");
    }

}
