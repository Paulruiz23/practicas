package Java1_Inicio;

public class VariablesandConstants {
    public static void main(String[] args) {

        String name = "Paul";
        System.out.println(name);

        int edad = 33;
        System.out.println(edad);

        double altura = 1.83;
        System.out.println(altura);
        /* existen otros tipos de datos para decimales = float, long, byte */

        boolean teGustaProgramar = true;
        System.out.println(teGustaProgramar);


        final String EMAIL = "paul_106_6@hotmail.com";
        System.out.println(EMAIL);

        char inicial= 'p';
        System.out.println(inicial);

        String localidad = "Comas";
        System.out.println(localidad);
        localidad = "Lima";
        System.out.println(localidad);

        int a = 5;
        int b = 7;
        System.out.println(a+b);

        System.out.println(EMAIL.getClass().getSimpleName());
        System.out.println(localidad.getClass());

        int edad2 ;
        edad2 = 19;
        System.out.println(edad2);


    }
}
