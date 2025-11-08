package Java3_Strings;

public class Strings {

        public static void main(String[] args) {

            // Declaración

            String name  = "Paul";
            var surname = new String("Cabrera");

            // Operaciones básicas

            // Concatenación

            System.out.println(name + " " + surname);

            // Longitud

            System.out.println(name.length());

            // Obtener carácter

            System.out.println(name.charAt(0));
            System.out.println(name.charAt(name.length()-1));

            // Subcadena

            System.out.println(surname.substring(3));
            System.out.println(surname.substring(1,5));

            // Mayusculas y Minusculas

            System.out.println(surname.toLowerCase());
            System.out.println(surname.toUpperCase());

            // Comprobar si contiene

            System.out.println("Hola, Java".contains("lima"));
            System.out.println("Hola, Java".toUpperCase().contains("AVA"));

            // Comparación

            System.out.println(name.equals("Paul"));
            System.out.println(name.equals("paul"));
            System.out.println(name.equalsIgnoreCase("paul"));

            // == vs. equals

            var a = "Ruiz";
            var b = "Ruiz";
            var c = new String("Ruiz");

            System.out.println(a == b);
            System.out.println(a == c);
            System.out.println(a.equals(c));

            // Trim
            System.out.println(" Hola, me llamo Paul ");
            System.out.println(" Hola, me llamo Paul ".trim());


            // Replace

            System.out.println(" Hola, me llamo Paul ".replace("Paul","Stuart").trim());

            // Format
            var age = 35;
            System.out.println(String.format("Hola, soy %s. Tengo %d años",name , age));


        }
    }
