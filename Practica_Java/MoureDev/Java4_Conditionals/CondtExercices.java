package Java4_Conditionals;

public class CondtExercices {
    public static void main(String[] args) {
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        var edad = 29;
        if (edad >= 18) {
            System.out.println("Puede Votar");
        } else {
            System.out.println("No puede Votar");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        var A = 49;
        var B = 122;
        if (A > B) {
            System.out.println(String.format("%d es mayor a %d", A, B));
        } else if (A < B) {
            System.out.println(String.format("%d es menor a %d", A, B));
        } else {
            System.out.println(String.format("%d es igual a %d", A, B));
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        var numero = 60;
        if (numero > 0) {
            System.out.println(String.format("%d es positivo", numero));
        } else if (numero < 0) {
            System.out.println(String.format("%d es negativo", numero));
        } else {
            System.out.println(String.format("es %d", numero));
        }

        // 4. Crea un programa que diga si un número es par o impar.
        var C = 47;
        if (C % 2 == 0) {
            System.out.println(String.format("El numero %d es par", C));
        } else {
            System.out.println(String.format("El numero %d es impar", C));
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        var D = 1006;
        if (D <= 100 && D >= 1) {
            System.out.println("Sí está en el rango");
        } else {
            System.out.println("No está en el rango");
        }

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        var diaSemana = 7;
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Numero invalido");
        }

        // 7. Simula un sistema de notas: muestra “Sobresaliente”, “Aprobado” o “Suspenso” según la nota (0-100).
        var nota = 6;
        if (nota <= 100 && nota >= 80) {
            System.out.println("Tu nota es Sobresaliente");
        } else if (nota < 80 && nota >= 50) {
            System.out.println("Tu nota es Aprobado");
        } else if (nota < 50 && nota >= 0) {
            System.out.println("Tu nota esta en Suspenso");
        } else {
            System.out.println("Nota invalida");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        var edadCine = 6;
        boolean acomp = false;
        if (edadCine >= 15 || acomp) {
            System.out.println("Puede ingresar al Cine");
        }
        else {
            System.out.println("No puede ingresar al Cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        var letra="u";
        var vocales ="aeiou";
        letra = letra.toLowerCase();

        if (vocales.contains(letra)) {
            System.out.println("Es Vocal");
        }
        else if (letra.matches("[a-z]")){
            System.out.println("Es Consonante");
        }
        else{

            System.out.println("Carácter no valido");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        var G = 1;
        var H = 1;
        var J = 2;
        if (G > H && G >J){
            System.out.println("G es el mayor");
        }
        else if (H > G && H > J) {
            System.out.println("H es el mayor");
        }
        else if (J>G && J >H) {
            System.out.println("J es el mayor");
        }
        else {
            System.out.println("Los números son iguales");
        }


    }
}
