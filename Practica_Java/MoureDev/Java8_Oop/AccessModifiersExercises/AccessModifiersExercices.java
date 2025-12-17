package Java8_Oop.AccessModifiersExercises;

public class AccessModifiersExercices {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos
        // getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        var person = new Person("Paul",12);
        System.out.println(person.getName());
        System.out.println(person.getAge());

        // 2. Crea una clase Product con el atributo privado price.
        // Añade el método setPrice(double price) que solo permita precios mayores a 0.
        var product = new Product(16.2);
        System.out.println(product.getPrice());

        // 3. Crea una clase BankAccount con el atributo privado balance.
        // Implementa los métodos deposit(double amount) y withdraw(double amount)
        // que validen las cantidades correctamente.
        var bankaccount = new BankAccount(4023);
        bankaccount.deposit(20);
        bankaccount.withdraw(150);

        // 4. Crea una clase Book con el atributo privado title.
        // Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()).
        //  El título debe asignarse solo por el constructor.
        var book = new Book("Paul");
        System.out.println(book.getTitle());


        // 5. Crea una clase Temperature con el atributo privado celsius.
        // El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        var temperatura = new Temperature(16.5);
        System.out.println(temperatura);

        // 6. Crea una clase User con los atributos privados username y password.
        // Implementa los métodos setUsername(String username), setPassword(String password)
        // y checkPassword(String inputPassword) que compare contraseñas.
        var user = new User("MgK123","paul1234");
        user.checkPassword("j123ee");
        user.checkPassword("paul1234");

        // 7. Crea una clase Employee con el atributo privado salary.
        // Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        var employe = new Employee(340);
        System.out.println(employe.getSalary());
        employe.raiseSalary(14);

        // 8. Crea una clase Rectangle con los atributos privados width y height.
        // Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        var rectangulo = new Rectangle(50,10);
        System.out.println("El area es: "+rectangulo.calculateArea());

        // 9. Crea una clase Student con el atributo privado grade.
        // Agrega los métodos setGrade(int grade) y isPassed()
        // que retorne true si la nota es mayor o igual a 60.
        var estudiante = new Student(66);
        System.out.println(estudiante.isPassed());
        estudiante.setGrade(55);
        System.out.println(estudiante.isPassed());

        // 10. Crea una clase Car con el atributo privado speed.
        // Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120)
        // y brake(int amount) que reduzca la velocidad (mínimo 0).
        var carro = new Car(120);
        carro.accelerate(20);
        System.out.println(carro.getSpeed());
        carro.brake(40);
        System.out.println(carro.getSpeed());
        }
    }
