package Java3_Strings;

public class StringsExercises {
    public static void main(String[] args) {
        // 1. Concatena dos cadenas de texto.

        String name = "Paul";
        String surname = "Stuart";
        System.out.println(name + surname);

        // 2. Muestra la longitud de una cadena de texto.

        System.out.println(name.length());

        // 3. Muestra el primer y último carácter de un string.

        System.out.println(surname.charAt(0));
        System.out.println(surname.charAt(surname.length()-1));

        // 4. Convierte a mayúsculas y minúsculas un string.

        System.out.println(surname.toLowerCase());
        System.out.println(surname.toUpperCase());

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.
        System.out.println("Hola, me llamo Paul Stuart".contains(name));
        // 6. Formatea un string con un entero.

        var age = 33;
        System.out.println(String.format("Hola, me llamo Paul y tengo %d años.", age));

        // 7. Elimina los espacios en blanco al principio y final de un string.

        System.out.println("  Hola, me llamo Paul. ".trim());

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

        System.out.println(" Hola, me llamo Paul. ".replace(" ","-"));

        // 9. Comprueba si dos strings son iguales.

        System.out.println(name.equals(surname));

        // 10. Comprueba si dos strings tienen la misma longitud.

        System.out.println(name.length()==surname.length());

    }
}
