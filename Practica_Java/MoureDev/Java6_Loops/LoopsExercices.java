package Java6_Loops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LoopsExercices {
    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        int index = 0;
        while (index <10){
            index++;
            System.out.println(index);
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        ArrayList<String> ciudades =new ArrayList<>();
        ciudades.add("Lima");
        ciudades.add("Comas");
        ciudades.add("Puno");
        ciudades.add("Arequipa");
        int b = 0;
        do {
            System.out.println(ciudades.get(b));
            b++;
        } while (b<ciudades.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        for (int i = 0; i<=50 ; i+=5){
            System.out.println(i);
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        Integer[] myNum= new Integer[5];
        myNum[0]=14;
        myNum[1]=1;
        myNum[2]=22;
        myNum[3]=54;
        myNum[4]=31;
        int sum = 0;
        for (int i = 0 ; i<5; i++){
            sum = sum +myNum[i];
        }
        System.out.println(sum);

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        String[] frutas = new String[4];
        frutas[0] = "pera";
        frutas[1] = "manzana";
        frutas[2] = "fresa";
        frutas[3] = "sandia";
        for (int i = 0 ; i < 4 ; i++){
            System.out.println(frutas[i]);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.
        HashSet<String>nombres = new HashSet<>();
        nombres.add("Paul");
        nombres.add("Ruiz");
        nombres.add("Stuart");
        for(String nombre:nombres){
            System.out.println(nombre);
        }
        HashMap<String,Integer>edades = new HashMap<>();
        edades.put("Paul",18);
        edades.put("Ruiz",28);
        edades.put("Stuart",14);
        for(Map.Entry<String,Integer> edad:edades.entrySet()){
            System.out.println(edad);
            System.out.println(edad.getKey());
            System.out.println(edad.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        for (int i = 10 ; i>=0 ; i--){
            System.out.println(i);
        }

        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        for (int i =1; i <=20 ; i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        Integer[] numeros= new Integer[6];
        numeros[0]=16;
        numeros[1]=73;
        numeros[2]=51;
        numeros[3]=99;
        numeros[4]=-161;
        numeros[5]=30;
        for(int i = 0 ; i < 6 ; i++ ){
            if(numeros[i]<0) {
                break;
            }
            System.out.println(numeros[i]);
        }

        // 10. Crea un programa que calcule el factorial de un número dado.
        int h = 8;
        int fact = 1;
        for(int i = 1 ; i <= h ; i++ ){
            fact *=i;
        }
        System.out.println("El factorial de "+ h + " es "+fact);

            }
        }





