package Java8_Oop.ClassesExercices;

public class Car {
    //Atributos
    String Brand;
    String Model;
    //Constructor
    public Car(String Brand,String Model){
        this.Brand = Brand;
        this.Model = Model;
    }
    //Metodos
    public void showData() {
        System.out.println("Marca: "+Brand+" y Modelo: " +Model);
    }

}
