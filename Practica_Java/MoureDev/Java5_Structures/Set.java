package Java5_Structures;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        //Declaracion y creacion
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<>();

        //tamaño
        System.out.println(names.size());

        // Añadir elementos
        names.add("Paul");
        names.add("Ruiz");
        names.add("Stuart");
        names.add("paul_106_4@hotmail.com");
        System.out.println(names.size());
        System.out.println(names);

        //eliminar elementos
        names.remove("Paul");
        System.out.println(names.size());

        //buscar elementos
        System.out.println(names.contains("Paul"));
        System.out.println(names.contains("Stuart"));
        names.add("Ruiz");
        names.add("Ruiz");
        names.add("Ruiz");
        System.out.println(names);

        //Conjuntos
        //names.addAll(numbers); //Error

        var countries = new HashSet<String>();
        countries.add("Peru");
        countries.add("Argentina");
        countries.add("España");
        countries.add("Stuart");

        names.addAll(countries);
        System.out.println(names);

        names.removeAll(countries);
        System.out.println(names);

        names.retainAll(countries);
        System.out.println(names);




    }
}
