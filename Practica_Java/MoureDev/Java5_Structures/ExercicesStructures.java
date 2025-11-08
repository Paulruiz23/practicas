package Java5_Structures;

import java.util.*;

public class ExercicesStructures {

    public static void main(String[] args) {

        // 1. Crea un Array con 5 valores e imprime su longitud.
        int[] edades = new int[5];
        // int[] edades = {10, 20, 30, 40};
        edades[0]=13;
        edades[1]=41;
        edades[2]=18;
        edades[3]=21;
        edades[4]=33;
        System.out.println(edades.length);

        String[] frutas = new String[6];
        frutas[0]="papaya";
        frutas[1]="manzana";
        frutas[2]="pera";
        frutas[3]="piña";
        frutas[4]="sandia";
        frutas[5]="plátano";


        // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.
        System.out.println(edades[1]);
        edades[1]=65;
        System.out.println(edades[1]);

        // 3. Crea un ArrayList vacío.
        ArrayList<String> nombres = new ArrayList<>();

        // 4. Añade 4 valores al ArrayList y elimina uno a continuación.
        nombres.add("Paul");
        nombres.add("Ruiz");
        nombres.add("Cabrera");
        nombres.add("Stuart");
        System.out.println(nombres);
        nombres.remove("Stuart");
        System.out.println(nombres);
        System.out.println(nombres.get(2));
        nombres.add(3,"Stuart");
        System.out.println(nombres);
        Collections.sort(nombres);
        System.out.println(nombres);
        System.out.println(nombres.get(2));


        // 5. Crea un HashSet con 2 valores diferentes.
        HashSet<String> perros = new HashSet<String>();
        perros.add("Chuwaca");
        perros.add("Snoopy");
        System.out.println(perros);

        // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.
        perros.add("Snoopy");
        perros.add("Muñeco");
        System.out.println(perros);

        // 7. Elimina uno de los elementos del HashSet.
        perros.remove("Muñeco");
        System.out.println(perros);

        // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.
        HashMap<String,Integer> guiatelf = new HashMap<>();
        guiatelf.put("Paul",785221206);
        guiatelf.put("Ruiz",843544233);
        guiatelf.put("Stuart",15655443);
        System.out.println(guiatelf);

        // 9. Modifica uno de los contactos y elimina otro.
        guiatelf.replace("Ruiz",11114444);
        guiatelf.remove("Paul");
        System.out.println(guiatelf);

        // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

        /* 1.Array a Arraylist usando for each*/
        ArrayList<String> listaFrutas = new ArrayList<>();
        for (String fruta : frutas){
            listaFrutas.add(fruta);
        }
        System.out.println(listaFrutas);

        /* Arraylist a hashSet usando for each */
        HashSet<String> listaFrutas2 = new HashSet<>();
        for (String fruta : listaFrutas){
            listaFrutas2.add(fruta);
        }
        System.out.println(listaFrutas2);

        /*HashSet a HashMap usando for each */
        HashMap<String,String> listaFrutas3 = new HashMap<>();
        for (String fruta : listaFrutas2){
            listaFrutas3.put(fruta,fruta);
        }
        System.out.println(listaFrutas3);


        /* 2.Array a Arraylist usando for each de Integer */
        ArrayList<Integer> listaEdades = new ArrayList<>();
        for (Integer edad:edades){
            listaEdades.add(edad);
        }
        System.out.println(listaEdades);

        /* Arraylist a HashSet usando for each */
        HashSet<Integer> listaEdades2 = new HashSet<>();
        for (Integer edad:listaEdades){
            listaEdades2.add(edad);
        }
        System.out.println(listaEdades2);

        /* HashSet a HashMap usando for each */
        HashMap<String,Integer> listaEdades3 = new HashMap<>();
        int i = 0;
        for (Integer edad:listaEdades2 ){
            listaEdades3.put(listaFrutas.get(i),edad);
            i++;
        }
        System.out.println(listaEdades3);

    }

}
