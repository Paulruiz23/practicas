package Java8_Oop.AbstractionExercices;

public class Mage extends Character {
    //Atributos
    private String baston;


    //Constructor
    public Mage(){

    }


    //Metodos
    @Override
    public String attack(){
        return "El mago ataca con bola de fuego";
    }


}
