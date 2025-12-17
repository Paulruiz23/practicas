package Java8_Oop;

public class Classes {
    public static void main(String[] args) {

        var person = new Person("Cabrera",20,1.70);

//        person.nombre = "Stuart";
//        person.talla = 1.85;
//        person.edad = 34;

        person.saludar();

        System.out.println(person.nombre);

        person.nombre = "Ruiz";
        System.out.println(person.nombre);

        System.out.println(person.getId());

        person.setAge(38);
        System.out.println(person.getAge());

        var person2 = new Person("Juam",27,1.55);
        person2.saludar();

    }
}
