package Java8_Oop.AccessModifiersExercises;

public class Product {
    //Atributo
    private double price;

    //Constructor
    public Product(double price) {
        this.setPrice(price);

    }

    //Metodo
    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
    if (price>0) {
        this.price = price;
    }
    else {
        System.out.println("Precio invalido");
    }
    }
}