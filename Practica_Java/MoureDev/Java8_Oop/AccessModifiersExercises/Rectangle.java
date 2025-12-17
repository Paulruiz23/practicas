package Java8_Oop.AccessModifiersExercises;

public class Rectangle {
    //Atributos
    private int width;
    private int height;

    //Constructor
    public Rectangle(int width,int height){
    this.setHeight(height);
    this.setWidth(width);

    }

    //Metodo
    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height){
        this.height=height;
    }

    public int calculateArea(){
        return width*height;
    }

}