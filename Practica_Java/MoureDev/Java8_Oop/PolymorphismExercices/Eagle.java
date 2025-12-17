package Java8_Oop.PolymorphismExercices;

public class Eagle extends Bird {
    public Eagle(String nombre) {
        super(nombre);
    }
    //Atributos


    //Constructor



    //Metodo
    @Override
    public void fly(){
        super.fly();
        System.out.println("El aguila vuela alto");
    }


}
