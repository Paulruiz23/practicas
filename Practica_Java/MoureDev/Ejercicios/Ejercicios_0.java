package Ejercicios;

public class Ejercicios_0 {
    public static void main(String[] args) {
    contarVocales("Murcielago");
    compPrimo(15);
    invertirTexto("Parasito");
    contarParesImpares(new int[]{13, 78, 99, 4, 32, 100, 22});
    operar(new Object[]{44,16,"+"});
    contarMayusculas("CaRacTeristicA");
    evaluarNotas(new int[]{43, 78, 37, 99, 66});
    nombreMasLargo(new String[]{"Paul", "Pedro", "Luis", "Manuel", "Stuart","Sebastian"});
    imprimirPiramide(6);
    contarPalabra("Hola me llame paul , me gusta programar y hacer meme","me");
    }

    // 1. Crea una función que reciba una palabra y devuelva cuántas vocales contiene.
    // Usa un loop para recorrer la palabra y condicionales para contar.
    // Ejemplo: contarVocales("Programar") → 3
    public static void contarVocales(String palabra) {
    palabra=palabra.toLowerCase();
    var voc = "aeiou";
    String h ;
    int j = 0;
       for(int i = 0 ; i<palabra.length() ; i++){
        h = String.valueOf(palabra.charAt(i));
           if (voc.contains(h)){
               j++;
           }
        }
        System.out.println("La palabra: " + palabra + " tiene "+ j + " vocales.");
    }

    // 2. Escribe una función que reciba un número entero y retorne true si es primo.
    // Usa un loop y operadores para comprobar divisibilidad.
    // Ejemplo: esPrimo(7) → true
    public static void compPrimo(Integer numEntero) {
        int i ;
        int divisores = 0;
        for( i = 1 ; i<=numEntero/2; i++) {
            if (numEntero% i == 0 ) {
            divisores++;
            }
        }
        if (divisores ==2) {
          //  System.out.println("El numero "+ numEntero + " es Primo");
            System.out.println("El numero "+ numEntero + " es Primo? : " + true);
        } else {
            //System.out.println("El numero "+ numEntero + " no es Primo");
            System.out.println("El numero "+ numEntero + " es Primo? : " + false);
        }
    }

    // 3. Crea una función que reciba una cadena y devuelva la misma cadena invertida.
    // Usa un loop para recorrer el texto desde el final al inicio.
    // Ejemplo: invertirTexto("Hola") → "aloH"
    public static void invertirTexto(String txt) {
        txt=txt.toLowerCase();
        char[] letras = new char[txt.length()];
        int m = 0;
        for (int i = (txt.length()-1) ; i>=0 ; i--){
            letras[m] = txt.charAt(i);
            m++;
        }
        System.out.println(String.valueOf(letras));
    }

    // 4. Escribe una función que reciba un array de enteros y devuelva cuántos son pares y cuántos impares.
    // Usa un loop y condicionales dentro.
    // Ejemplo: contarParesImpares({2,5,8,9}) → "Pares: 2 | Impares: 2"
    public static void contarParesImpares(int[] numeros) {
        int par = 0;
        int impar = 0;
        for (int i = 0; i<numeros.length ; i++) {
            //System.out.println(numeros[i]);
            if (numeros[i]%2==0){
                    par++;
            }
            else {
                impar++;
            }
        }
        System.out.println("En la lista números hay " + par + " pares y " + impar + " impares.");
    }

    // 5. Crea una función que reciba dos números y un operador (+, -, *, /).
    // Usa condicionales para ejecutar la operación correspondiente.
    // Ejemplo: operar(4, 2, '*') → 8
    public static void operar(Object[] operador) {

        int a = (int) operador[0];
        int b = (int) operador[1];
        String op = (String) operador[2];

        if (op.equals("+")) {
            System.out.println("La suma es: " + (a + b));
        }
        else if (op.equals("-")) {
            System.out.println("La resta es: " + (a - b));
        }
        else if (op.equals("*")) {
            System.out.println("La multiplicación es: " + (a * b));
        }
        else if (op.equals("/")) {
            // convertir a double para una división real
            System.out.println("La división es: " + ((double) a / b));
        }
    }

    // 6. Escribe una función que reciba una cadena y devuelva cuántas letras mayúsculas contiene.
    // Usa un loop y un condicional para comparar caracteres.
    // Ejemplo: contarMayusculas("Hola JAVA") → 4
    public static void contarMayusculas(String palabra) {
        var letra = 0;
        for (int i = 0 ; i < palabra.length() ; i++) {
            if (Character.isUpperCase(palabra.charAt(i))) {
                letra ++;
            }
        }
        System.out.println("La palabra '"+ palabra+"' tiene "+letra+ " mayúsculas.");
    }

    // 7. Crea una función que reciba un array de notas (enteros) y retorne el promedio,
    // luego usa un condicional para decir si el promedio es "Aprobado" (>= 60) o "Reprobado".
    // Ejemplo: evaluarNotas({70, 80, 50}) → "Promedio: 66.6 - Aprobado"
    public static void evaluarNotas(int[] notas) {
        int sum = 0;
        for (int nota: notas){
            sum += nota;
        }
        double promedio = (double) sum/notas.length;
        if (promedio>=60) {
            System.out.println("El promedio es : " + promedio+ " -- Aprobado");
        }else {
            System.out.println("El promedio es : " + promedio+ " -- Desaprobado ");
        }
    }

    // 8. Escribe una función que reciba una lista de nombres y devuelva el nombre más largo.
    // Usa un loop para comparar la longitud de cada String.
    // Ejemplo: nombreMasLargo(["Ana", "María", "Sebastián"]) → “Sebastián”
    public static void nombreMasLargo(String[] nombres) {
        String mayor = nombres[0];
        for (String nombre :nombres){
            if (nombre.length() > mayor.length()){
                mayor =nombre;
            }
        }
        System.out.println("El nombre mas largo es " + mayor);
    }

    // 9. Crea una función que reciba un número entero y muestre una pirámide de asteriscos.
    // Usa loops anidados (uno para filas y otro para columnas).
    // Ejemplo: imprimirPiramide(3)
    // *
    // **
    // ***
    public static void imprimirPiramide(Integer numero) {
        for (int i = 1 ; i <= numero ; i++) {
            for (int j = 1; j <= numero-i ; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2*i-1) ; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("Imprimir piramide de : " + numero);
    }

    // 10. Escribe una función que reciba una frase y una palabra.
    // Indica si la palabra está dentro de la frase (usa contains o indexOf),
    // y cuántas veces aparece (usa loop y condicionales).
    // Ejemplo: contarPalabra(“hola mundo hola", “hola” → “La palabra aparece 2 veces
    public static void contarPalabra(String frase, String palabra) {

        if (frase.contains(palabra)) {
            System.out.println("La palabra SÍ está en la frase");
        } else {
            System.out.println("La palabra NO está en la frase");
        }

        int contador = 0;

        //  Recorrer la frase para buscar todas las ocurrencias
        for (int i = 0; i <= frase.length() - palabra.length(); i++) {

            //  Extraer un pedazo del tamaño de la palabra
            String pedazo = frase.substring(i, i + palabra.length());

            //  Comparar si ese pedazo es igual a la palabra
            if (pedazo.equals(palabra)) {
                contador++;
            }
        }
        System.out.println("La palabra aparece " + contador + " veces");
    }
}
