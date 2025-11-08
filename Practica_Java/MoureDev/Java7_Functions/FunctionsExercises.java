package Java7_Functions;

import java.util.ArrayList;
import java.util.Arrays;

public class FunctionsExercises {

    public static void main(String[] args) {
        bienvenida();
        bienvenida("Paul");
        restar(14,2);
        cuadrado(8);
        paroimpar(151);
        edadUser(8);
        myName("Stuart");
        media(new ArrayList<Integer>(Arrays.asList(16,22,44,53,34,11,1,98)));
        factorial(4);
        ensaladaFrutas(new ArrayList<>(Arrays.asList("Fresa","Manzana","Kiwi","Papaya","Sandia","Plátano")));
    }
    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    public static void bienvenida(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void bienvenida(String saludo){
        System.out.println("Hola te doy la bienvenida " + saludo);
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static void restar(Integer numero1,Integer numero2) {
        System.out.println("La resta es = " + (numero1-numero2));
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static void cuadrado(Integer numero) {
        System.out.println("El cuadrado es = " + (numero*numero));
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static void paroimpar(Integer numero) {
           if(numero%2==0) {
               System.out.println("El numero " + numero + " es par.");
           }
           else {
               System.out.println("El numero " + numero + " es impar.");
           }
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static boolean edadUser (Integer edad) {
        if(edad < 18){
            System.out.println("El usuario es menor de edad");
        return false;
        }
        System.out.println("El usuario es mayor de edad");
        return true;
    }

    // 7. Implementa una función que reciba un String y retorne su longitud.
    public static boolean myName(String nombre){
        if(nombre.isEmpty()){
            return false;
        }
        System.out.println("La longitud de " + nombre + " es: "+nombre.length());
        return true;
    }

    //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static void media(ArrayList<Integer> numeros) {
        System.out.println("Lista de números: "+numeros);
        double sum = 0;
        for(Integer numero : numeros){
            sum = sum + numero;
        }
        System.out.println("La media de la lista de números es = "+sum/numeros.size());

    }

    // 9. Escribe un método que reciba un número y retorna su factorial.
    public static void factorial(Integer numero) {
        int fact = 1;

        for(int i = 1 ; i<=numero; i++){
            fact *=i;
        }
        System.out.println("El factorial de " + numero + " es = "+fact);
    }
    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    public static void ensaladaFrutas(ArrayList<String> frutas) {
        for(String fruta : frutas){
            System.out.println("Esta ensalada de frutas contiene " + fruta);
        }
    }
}