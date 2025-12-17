package Java8_Oop.ClassesExercices;

public class Product {
    //Atributo
    String producto;
    double precio;
    double descuento;

    //Constructor
    public Product(String producto,double precio, double descuento){
        this.producto=producto;
        this.precio=precio;
        this.descuento=descuento;
    }

    //Metodo
    public void descuentoProduct(){
        System.out.println("Se aplicó un descuento a su producto: "+producto+" de "+descuento+"% su nuevo precio es: "+(precio-(precio*descuento/100)));

    }
    public String toString(){
        return "Se aplicó un descuento a su producto: "+producto+" de "+descuento+"% su nuevo precio es: "+(precio-(precio*descuento/100));
    }

}
