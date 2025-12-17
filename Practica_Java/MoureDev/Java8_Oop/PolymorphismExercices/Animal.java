package Java8_Oop.PolymorphismExercices;

public class Animal {
    //Atributos
    private String nombre;


    //Constructor
    public Animal(String nombre){
       this.setNombre(nombre);
    }



    //Método

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public void makeSound(){
        System.out.println("El "+getNombre()+" hace woof");
    }

    public String getType(){
        return "Animal";
    }

    public void showAnimalType(Animal animal){
        System.out.println("Tipo de animal: "+animal.getType());
    }

}
