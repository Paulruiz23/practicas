package Java8_Oop.ClassesExercices;

import Java8_Oop.Person;

import java.util.ArrayList;

public class ClassesExercises {

    public static void main(String[] args) {
        ArrayList<Person> listaPersonas = new ArrayList<>();
        ArrayList<Product> listaProductos = new ArrayList<>();
        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        //Creando el objeto
        Book libroA = new Book("Ciudad de los perros","Mario Vargas Llosa",1992,120);
        //Mostrando datos
        System.out.println("Titulo: " + libroA.Tittle);
        System.out.println("Autor: " + libroA.Autor);

        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        Dog Perro = new Dog();
        Perro.bark();

        // 3. Añade un constructor a la clase Book que reciba precio y año de fabricación.
        Book libroB = new Book("Caballero Carmelo","Abraham Valderomar",1990,100);

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        Car honda = new Car("Honda","Civic");
        honda.showData();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        Student Paul = new Student(70);
        Paul.nota();

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        BankAccount bcp = new BankAccount(100);
        bcp.Saldo();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        Rectangulo a = new Rectangulo(33,20);
        a.Area();
        a.Perimetro();

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        Worker trabajador1 = new Worker("Paul",150);
        trabajador1.mostrarSalario();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        Person stuart = new Person("Stuart",20,1.90);
        Person ruiz = new Person("Ruiz",33,1.83);
        Person cabrera = new Person("Cabrera", 35,1.70);

        listaPersonas.add(stuart);
        listaPersonas.add(ruiz);
        listaPersonas.add(cabrera);
        for(Person b : listaPersonas){
            System.out.println(b);
        }

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        Product Leche = new Product("leche",2.33,44);
        Product Jabon = new Product("jabon",3.01,21);
        Product Pan = new Product("pan",1.5,10);
        listaProductos.add(Leche);
        listaProductos.add(Jabon);
        listaProductos.add(Pan);
        for (Product h : listaProductos){
            System.out.println(h);
        }
        Leche.descuentoProduct();
        Pan.descuentoProduct();
        Jabon.descuentoProduct();

    }
}
