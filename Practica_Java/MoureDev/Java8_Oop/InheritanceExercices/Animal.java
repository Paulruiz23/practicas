package Java8_Oop.InheritanceExercices;

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

}
