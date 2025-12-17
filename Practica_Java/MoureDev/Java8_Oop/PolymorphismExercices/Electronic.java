package Java8_Oop.PolymorphismExercices;

public class Electronic extends Product{
    //Atributos



    //Constructor
    public Electronic(String producto, double precio, double descuento) {
        super(producto, precio, descuento);
    }


    //Metodo
    @Override
    public double getDescuento(){

        return descuento+5;
    }

}
