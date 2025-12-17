package Java8_Oop;

public class Person {

    // Atributos
    protected String nombre ;
    private int edad;
    final private double talla;

    // Constructor
    public Person(String nombre,int edad,double talla){
        this.nombre=nombre;
        this.setAge(edad);
        this.talla=talla;
    }

    // Funciones o métodos
    public void saludar(){

        System.out.println("Hola soy "+nombre+" mido "+talla+" y tengo "+ edad+" años");
    }
    // Getter
    public String toString(){
        return "Nombre: "+nombre+", Edad: "+edad+", Talla: "+talla;
    }

    public int getAge() {
        return edad;
    }

    public double getId() {
        return talla;
    }

    // Setter
    public void setAge(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida");
        }
    }

}
