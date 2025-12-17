package Java8_Oop.PolymorphismExercices;

public class Product {
    //Atributo
    private String producto;

    private double precio;
    protected double descuento;

    //Constructor
    public Product(String producto,double precio, double descuento){
            this.setProducto(producto);
            this.setPrice(precio);
            this.setDescuento(descuento);
        }


    //Metodo
    public String getProducto(){
        return producto;
    }

    public double getDescuento(){
        return descuento;
    }

    public double getPrice(){
        return precio;
    }

    public void setProducto(String producto){
        this.producto=producto;
    }

    public void setDescuento(double descuento){
        this.descuento=descuento;
    }

    public void setPrice(double precio){
        if (precio>0) {
            this.precio = precio;
        }
        else {
            System.out.println("Precio invalido");
        }
    }

    public String descuentoProduct(){
        return "Se aplicó un descuento a su producto: "+getProducto()+" de "+getDescuento()+"% su nuevo precio es: "+(getPrice()-(getPrice()*getDescuento()/100));

    }

    public String toString(){
        return "Se aplicó un descuento a su producto: "+producto+" de "+descuento+"% su nuevo precio es: "+(precio-(precio*descuento/100));
    }
}