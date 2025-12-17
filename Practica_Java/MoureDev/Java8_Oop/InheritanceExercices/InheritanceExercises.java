package Java8_Oop.InheritanceExercices;

import java.util.ArrayList;

public class InheritanceExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move().
        // Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        var car = new Car(100,"Audi");
        car.move();
        car.honk();

        // 2. Define una clase Person con los atributos name y age.
        // Luego crea una clase Student que agregue el atributo grade y un método study().
        var estudiante = new Student(77,"Paul",16);
        estudiante.study();

        // 3. Crea una clase Animal con el método makeSound().
        //  Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        var animal = new Cat("Gato");
        animal.makeSound();
        var animal2 = new Dog("Perro");
        animal2.makeSound();

        // 4. La clase Employee tiene los atributos name y salary.
        // Manager hereda de Employee y agrega el atributo department.
        var manager = new Manager("Stuart",220,5);
        System.out.println(manager.getDepartment());
        System.out.println(manager.getName());

        // 5. Crea una clase abstracta Shape con un método calculateArea().
        //  Luego implementa ese método en Circle y Rectangle.
        var circulo = new Circle(4);
        var rectangulo = new Rectangle(10,2);
        System.out.println(circulo.calculatedArea());
        System.out.println(rectangulo.calculatedArea());

        // 6. Crea una clase Bird con el método fly().
        //  Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        var aguila = new Eagle("Aguila");
        aguila.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”.
        // Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        var telefono = new Phone();

        // 8. BankAccount tiene un saldo y métodos para deposit() y withdraw().
        // SavingsAccount hereda y agrega un método addInterest().
        var cuentaNueva = new SavingsAccount(100,2);
        cuentaNueva.addInterest();

        // 9. Crea una clase Vehicle y tres subclases:
        // Car, Bike y Truck, cada una con un método describe() sobrescrito.
        var bike = new Bike("BMX");
        var truck = new Truck("Honda");
        bike.describe();
        car.describe();
        truck.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird.
        // Recorre la lista y llama a makeSound().
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Cat("Gato"));
        animales.add(new Dog("Perro"));
        animales.add(new Bird("Ave"));



        for (Animal a : animales){
            a.makeSound();
        }

    }
}