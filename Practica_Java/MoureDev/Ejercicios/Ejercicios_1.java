package Ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ejercicios_1 {

    public static void main(String[] args) {
        // Llama a tus métodos aquí para probables.
        // sumaPositiva(1,29);
        //listaDePalabras();
        //calculadora(19,40,"-");
        //mayoresAlPromedio(new ArrayList<Integer>(Arrays.asList(30,22,10,88,46,51,3)));
        //reversaInteligente("Hola mi nombre es Paul");
        //adivinaNumero();
        //factorialRecursivo(5);
        //miniDiccionario();
        //contarMayores(new ArrayList<>());
        menuPrincipal();
    }

    // Ejercicio 1: Suma condicional con validación
    // Crea un método que reciba dos números y devuelva su suma,
    // pero solo si ambos son positivos. Si alguno es negativo, devuelve 0
    // (investiga sobre el uso de return para salir temprano de un método).

    public static int sumaPositiva(int a, int b) {
        // tu código aquí
        if (a <0 && b < 0){
            System.out.println("Suma invalida , hay números negativos");
         return 0;
        }
        int suma = a + b;
        System.out.println("La suma es "+suma);
        return suma;
    }

    // Ejercicio 2: Lista dinámica de palabras
    // Crea un método que pida palabras por consola hasta que el usuario escriba "fin".
    // Luego muestra cuántas palabras se ingresaron y cuál fue la más larga.
    // (investiga sobre Scanner y cómo usarlo dentro de métodos).
    public static void listaDePalabras() {
        // tu código aquí
        Scanner p = new Scanner(System.in);
        ArrayList<String> palabras = new ArrayList<>();

        System.out.println("Ingrese las palabras para guardar");
        System.out.println("Cuando desee terminar, escriba 'fin'");
        while (true) {
            String palabra = p.nextLine();

            if (palabra.equalsIgnoreCase("fin")) {
                break;
            }
            palabras.add(palabra);
        }
        if (palabras.isEmpty()) {
            System.out.println("No se ingresaron palabras.");
            return;
        }
        String mayor = palabras.get(0);
        for (String nombre :palabras){
            if (nombre.length() > mayor.length()){
                mayor =nombre;
            }
        }
        System.out.println("Se ingresaron : "+palabras.size()+" palabras y la palabra mas larga fue "+mayor);

    }

    // Ejercicio 3: Calculadora flexible
    // Crea una función que reciba tres parámetros: número1, número2, y una operación ("+", "-", "*", "/").
    // Devuelve el resultado según la operación. Usa if/else o switch (tu elección).
    public static double calculadora(double a, double b, String operacion) {
        // tu código aquí
        double resultado = 0;
        if (operacion.equals("+")){
            resultado=a+b;
        }
        else if (operacion.equals("-")) {
            resultado=a-b;
        }
        else if (operacion.equals("*")) {
            resultado=a*b;
        }
        else if (operacion.equals("/")) {
            if (b==0){
                System.out.println("Error!, Division invalida");
                return 0;
            }
            resultado=a/b;
        }
        else {
            System.out.println("Operación inválida "+operacion);
            return 0;
        }
        System.out.println(resultado);
        return resultado;
    }

    // Ejercicio 4: Promedio superior
    // Dado un ArrayList de enteros, devuelve solo los números que estén por encima del promedio.
    // (investiga sobre cómo crear una nueva lista a partir de otra).
    public static ArrayList<Integer> mayoresAlPromedio(ArrayList<Integer> lista) {
        // tu código aquí
        if (lista.size()==0){
            System.out.println("Lista vacia");
            return new ArrayList<>();
        }
        double suma = 0;
        ArrayList<Integer> mayores = new ArrayList<>();
        for(int i : lista){
            suma +=i;
        }
        double promedio = suma/lista.size();
        System.out.println(promedio);
        for (int i : lista) {
            if (i > promedio) {
                mayores.add(i);
            }
        }
        System.out.println(mayores);
        return mayores;
    }

    // Ejercicio 5: Reversa inteligente
    // Crea un método que reciba una cadena de texto y la devuelva invertida,
    // pero solo si tiene más de 5 caracteres. Si no, devuelve la misma.
    // (piensa cómo usar StringBuilder.reverse()).
    public static String reversaInteligente(String texto) {
        // tu código aquí
        if (texto.length()>5){
            StringBuilder palabra = new StringBuilder(texto);
            palabra.reverse();
            System.out.println(palabra);
            return palabra.toString();
        }
        else {
            System.out.println(texto);
            return texto;
        }
    }

    // Ejercicio 6: Adivina el número
    // Crea un método que genere un número aleatorio del 1 al 10 y pida al usuario adivinarlo.
    // Da pistas si el número ingresado es mayor o menor.
    // (investiga Random y bucles while).
    public static void adivinaNumero() {
        // tu código aquí
        Scanner textoUsuario = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random()*10+1);
        System.out.println(numeroSecreto);
        System.out.println("Bienvenido al juego 'Adivina el número'");
        System.out.println("Adivine un numero del 1 al 10");
        int numeroUsuario = textoUsuario.nextInt();

        while (numeroUsuario!=numeroSecreto){
            if(numeroUsuario<1|| numeroUsuario>10) {
                System.out.println("Su numero es invalido");
            }
            else if (numeroUsuario>numeroSecreto) {
                System.out.println("Su número es muy alto");
            }
            else if (numeroUsuario < numeroSecreto) {
                    System.out.println("Su número es muy bajo");
            }
            System.out.println("Ingrese un nuevo numero");
            numeroUsuario = textoUsuario.nextInt();
        }
        System.out.println("Felicidades adivino el numero secreto!");
    }

    // Ejercicio 7: Factorial recursivo
    // Repite el ejercicio de factorial, pero usando recursividad en lugar de bucle.
    // (investiga sobre métodos recursivos y casos base).
    public static int factorialRecursivo(int n) {
        // tu código aquí
        if(n < 0){
            System.out.println("Factorial indefinido para números negativos");
            return -1;
        }
        if(n==1||n==0){
            return 1;
        }
        int resultado = n*factorialRecursivo(n-1);
        return resultado;
    }

    // Ejercicio 8: Diccionario simple
    // Crea un HashMap donde la clave sea una palabra en inglés y el valor su traducción.
    // Permite al usuario escribir una palabra y devuelve su traducción si existe.
    // (investiga cómo recorrer HashMap y validar claves).
    public static void miniDiccionario() {
        // tu código aquí
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("dog", "perro");
        diccionario.put("cat", "gato");
        diccionario.put("tree", "árbol");
        diccionario.put("chair", "silla");
        diccionario.put("window", "ventana");
        diccionario.put("chicken", "pollo");
        diccionario.put("table", "mesa");
        diccionario.put("apple", "manzana");
        System.out.println("Bienvenido al Diccionario de ingles");
        Scanner userPalabra = new Scanner(System.in);
        System.out.println("Ingrese la palabra a traducir");
        String userBusqueda = userPalabra.nextLine().toLowerCase();
        if (!userBusqueda.matches("[a-zA-Z]+")) {
            System.out.println("Palabra inválida (solo letras permitidas)");
            return;
        }
        if (diccionario.containsKey(userBusqueda)){
            System.out.println("Su traducción es "+diccionario.get(userBusqueda));
        }else {
            System.out.println("La palabra no existe en el diccionario");
        }

    }

    // Ejercicio 9: Filtrador de edades
    // Crea una lista de edades (enteros) y devuelve cuántas son mayores o iguales a 18.
    // (usa bucles for-each y contadores).
    public static void contarMayores(ArrayList<Integer> edades) {
        // tu código aquí
        edades.clear();
        Scanner sc =new Scanner(System.in);
        System.out.println("Bienvenido al filtrador de edades");

        int arraySize = 0;

        while (arraySize<1) {
            System.out.println("Ingrese cuantas edades registrará");

            if (!sc.hasNextInt()){
                System.out.println("Carácter no valido. Ingrese un numero");
                sc.nextLine();
                continue;
            }
            arraySize=sc.nextInt();
            sc.nextLine();

            if (arraySize<1){
                System.out.println("Cantidad inválida. Intente nuevamente");
            }
        }

        while (true) {
            System.out.println("Estas seguro de la cantidad ingresada? (si/no)");
            String confirmacion = sc.nextLine().toLowerCase();

            if (confirmacion.equals("si")) {
                break;
            } else if (confirmacion.equals("no")) {
                System.out.println("Ingrese nuevamente cuantas edades registrará");
                arraySize = sc.nextInt();
                sc.nextLine();
            }else {
                System.out.println("Respuesta Invalida. Por favor escriba si/no.");
            }
        }

            for (int i = 0; i < arraySize; i++) {
                int faltan = arraySize - i;
                System.out.println("Le quedan "+faltan+" edades por ingresar.");
                if(!sc.hasNextInt()){
                    System.out.println("Edad inválida. Ingrese un número");
                    sc.nextLine();
                    i--;
                    continue;
                }

                int edad = sc.nextInt();
                sc.nextLine();

                if (edad <0){
                    System.out.println("La edad no puede ser negativa.");
                    i--;
                    continue;
                }
                edades.add(edad);
            }


        int a = 0;
        for (int edad : edades) {
            if (edad <= 0 || edad > 120) {
                System.out.println("Existe una edad invalida " + edad);
                return;
            }
        }
        for (int edad : edades){
            if (edad >=18){
                a++;
            }
        }
        System.out.println("La lista de edades es : "+edades);

        String palabra =(a==1)?"persona":"personas";
        String verbo =(a==1)?"mayor":"mayores";
        System.out.println("Tienes "+a+" "+ palabra+ " "+verbo+" de edad.");
    }

    // Ejercicio 10: Menú interactivo (reto final)
    // Crea un menú de texto que permita ejecutar algunos de los métodos anteriores.
    // Usa un bucle while y Scanner para leer la opción del usuario.
    // (investiga cómo hacer menús simples con texto).
    public static void menuPrincipal() {
        // tu código aquí
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("=====================================");
            System.out.println("        BIENVENIDO A MI MENÚ         ");
            System.out.println("=====================================");
            System.out.println("1. Lista de palabras");
            System.out.println("2. Adivina el número");
            System.out.println("3. Factorial recursivo");
            System.out.println("4. Mini diccionario");
            System.out.println("5. Contar mayores");
            System.out.println("0. Salir");
            System.out.println("=====================================");
            System.out.print("Seleccione una opción: ");

            /*    Verificación de errores   */

            if (!sc.hasNextInt()) {
                System.out.println("Carácter no valido. Ingrese un numero");
                sc.nextLine();
                continue;
            }
            int valorMenu = sc.nextInt();
            sc.nextLine();
            if (valorMenu < 0 || valorMenu > 5) {
                System.out.println("Opción fuera de rango(0-5), Intente nuevamente");
                continue;
            }

            /*    Selección de Menu    */

            if (valorMenu==0){
                System.out.println("Saliendo del programa");
                break;
            }
            if (valorMenu == 1) {
                listaDePalabras();
            } else if (valorMenu == 2) {
                adivinaNumero();
            } else if (valorMenu == 3) {
                int resultado = factorialRecursivo(10);
                System.out.print("El Factorial es = " + resultado);
            } else if (valorMenu == 4) {
                miniDiccionario();
            } else if (valorMenu == 5) {
                contarMayores(new ArrayList<>());
            }
            System.out.println("\nPresione ENTER para volver al menu...");
            sc.nextLine();

        }
    }
}

