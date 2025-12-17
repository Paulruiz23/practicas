package Java8_Oop.AbstractionExercices;

public class Book extends Product {

    //Atributos
    private String title;


    //Constructor
    public Book(String title,String producto, double precio, double descuento) {
        super(producto,precio,descuento);
        this.title = title;

    }


    //Metodo

    public String getTitle(){
        return title;
    }

    @Override
    public double getDescuento(){
        return descuento +10;
    }


}
