package Java8_Oop.PolymorphismExercices;

import java.util.ArrayList;

public class PolymorphismExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound().
        //  Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes.
        //  Llama al método desde una lista de Animal.
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Cat("Gato"));
        animales.add(new Dog("Perro"));
        animales.add(new Bird("Ave"));
        animales.add(new Cow("Vaca"));
        for (Animal a : animales){
            a.makeSound();
        }


        // 2. Crea una clase Shape con el método calculateArea().
        //  Luego implementa subclases Circle y Rectangle con sus propias fórmulas.
        //  Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        ArrayList<Shape> formas = new ArrayList<>();
        formas.add(new Rectangle(10,2));
        formas.add(new Circle(4));
        for(Shape a : formas){
            System.out.println(a.calculatedArea());
        }


        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten
        // diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        var imprime = new Printer();
        imprime.print(5,3);
        imprime.print("hola","paul");
        imprime.print(2.1,2.7);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”,
        // y otro que reciba un nombre y salude con “Hello, [nombre]”.
        var greet = new Greeter();
        greet.greet();
        greet.greet("Paul");


        // 5. Crea una clase Vehicle con un método start().
        //  Luego crea Car, Bike y Truck que sobrescriban ese método.
        //   Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        ArrayList<Vehicle> vehiculos = new ArrayList<>();
        vehiculos.add(new Bike("BMX"));
        vehiculos.add(new Truck("Honda"));
        vehiculos.add(new Car(120,"Hiunday"));
        for (Vehicle a:vehiculos){
            a.start();
        }


        // 6. Crea una clase Notification con método send(),
        //  y subclases EmailNotification, SMSNotification.
        //  Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        var notifi = new SMSNotification();
        notifi.send();
        var notifi2 = new EmailNotification();
        notifi2.send();


        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal.
        // Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima
        // su tipo con su propio getType() sobrescrito.
        for (Animal a : animales){
            a.showAnimalType(a);
        }


        // 8. Crea una clase Converter con métodos convert(int), convert(double),
        // y convert(String) que devuelvan diferentes formatos de texto.
        var conversor = new Converter();
        System.out.println(conversor.convert(2));
        System.out.println(conversor.convert("dos"));
        System.out.println(conversor.convert(2.2));

        // 9. Crea una clase Product con el método getPrice().
        //  Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento.
        //  Recorre una lista de Product e imprime el precio final de cada uno.

        ArrayList<Product>productos = new ArrayList<>();
        productos.add(new Electronic("cable",30,2));
        productos.add(new Book("Caballero Carmelo","Libro",40,20));
        productos.add(new Electronic("cargador",10,5));
        productos.add(new Book("Don quijote","cuento",30,5));

        for (Product a : productos){
            System.out.println(a.descuentoProduct());

        }


        // 10. Crea una clase Character con método attack().
        //  Luego crea subclases Warrior, Archer, Mage con ataques diferentes.
        //  En main, crea un array de Character y llama a attack() para cada uno.
        ArrayList<Character> personajes = new ArrayList<>();
        personajes.add(new Archer());
        personajes.add(new Mage());
        personajes.add(new Warrior());
        for (Character a : personajes){
            System.out.println(a.attack());
        }



    }
}
