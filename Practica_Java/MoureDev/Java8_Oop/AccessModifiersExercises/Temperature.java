package Java8_Oop.AccessModifiersExercises;

public class Temperature {
    //Atributos
    private double celsius;


    //Constructor
    public Temperature(double celsius) {
        this.setCelsius(celsius);
    }

    //Metodo
    public double getCelsius(){
        return celsius;
    }
    public void setCelsius(double celsius){
        if (celsius<100 && celsius>-100){
            this.celsius = celsius;
        }
        else {
            System.out.println("Temperatura invalida");
        }
    }
    public String toString(){
        return "La temperatura : "+celsius+" °C";
    }

}
