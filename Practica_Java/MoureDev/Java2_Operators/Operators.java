package Java2_Operators;

public class Operators {
    public static void main(String[] args) {
        // Aritméticos

        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Asignación

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; // a = a + 1
        System.out.println(a);

        a -= 1;
        System.out.println(a);
        a *= 2;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 2;
        System.out.println(a);

        // Comparación (Relacionales)

        System.out.println(a == b);
        System.out.println(a == 0);

        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);

        // Lógicos

        // Y (AND)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3 > 2 && 5 == 2);

        // O (OR)
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3 > 2 || 5 == 2);

        // NO (NOT)
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(!(3 > 2) || 5 == 2);

        // Unarios
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);
        System.out.println(b++);
        System.out.println(b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);


        /* EJERCICIOS */

        //  ----1
        var suma = 3 + 5;
        var resta = 6 - 8;
        var multiplicacion = 2 * 4;
        var division = 6 / 3;
        System.out.println("suma = "+ suma + "\n" +"resta = "+resta + "\n"+"multiplicacion = "+multiplicacion + "\n"+ "division = " + division);

        //  ----2
        var m = 10; //asignacion simple
        var sumayasigna = (m += 9);
        var restayasigna = (m -= 5);
        var muliplicayasigna = (m *= 3);
        var divideyasigna = (m /= 2);
        var moduloyasigna = (m %=2 );
        System.out.println("asignacion simple = "+m);
        System.out.println("suma y asigna = "+sumayasigna);
        System.out.println("resta y asigna = "+restayasigna);
        System.out.println("multiplica y asigna = "+muliplicayasigna);
        System.out.println("divide y asigna = "+divideyasigna);
        System.out.println("modulo y asigna = "+moduloyasigna);

        //  ----3
        System.out.println(suma == multiplicacion);
        System.out.println( multiplicacion >= suma);
        System.out.println(resta < division);

        //  ----4

        System.out.println(sumayasigna == suma);
        System.out.println( divideyasigna < resta);
        System.out.println( resta >= moduloyasigna);

        //  ----5

        System.out.println(suma>resta && moduloyasigna==multiplicacion);

        //  ----6

        System.out.println(division == moduloyasigna || restayasigna<=multiplicacion);

        //  ----7

        System.out.println((m == resta && moduloyasigna >multiplicacion)||division<= m);

        //  ----8

        System.out.println(!(m == resta && moduloyasigna >multiplicacion)||division<= m);

        //  ----9

        System.out.println(+m);
        System.out.println(--suma);
        System.out.println(++resta);

        //  ----10

        System.out.println(((suma + resta) == (multiplicacion - m)) || (moduloyasigna- division) < (restayasigna*sumayasigna));
        System.out.println(((suma + resta) == (multiplicacion - m)) && (moduloyasigna- division) < (restayasigna*sumayasigna));









    }
}


