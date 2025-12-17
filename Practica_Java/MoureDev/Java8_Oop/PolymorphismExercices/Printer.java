package Java8_Oop.PolymorphismExercices;

public class Printer {
    //Atributos


    //Constructor


    //Metodo
    public int print(int a, int b){
        System.out.println("Imprime: "+a+b);
        return a;
    }

    public String print(String a, String b){
        System.out.println("Imprime: "+a+b);
        return a;
    }
    public double print(double a,double b){
        System.out.println("Imprime: "+a+b);
        return a;
    }
}
