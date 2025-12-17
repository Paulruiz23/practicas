package Java8_Oop.AbstractionExercices;

public class Circle extends Shape {
    //Atributos
    private int radio;


    //Constructor
    public Circle(int radio){
        this.setRadio(radio);
    }



    //Metodo
    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public int calculatedArea(){
        return radio*radio;
    }
}
