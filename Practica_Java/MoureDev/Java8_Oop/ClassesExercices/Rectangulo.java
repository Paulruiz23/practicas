package Java8_Oop.ClassesExercices;

public class Rectangulo {
    //Atributos
    int base;
    int altura;

    //Constructor
    public Rectangulo(int base, int altura){
        this.altura = altura;
        this.base = base;
    }

    //Metodo
    public void Area(){
        System.out.println("El área del rectángulo es: "+(altura*base));
    }
    public void Perimetro(){
        System.out.println("El perímetro del rectángulo es: "+((2*base)+(2*altura)));
    }
}
