package Java8_Oop.AccessModifiersExercises;

public class Person {

    //Atributos

    private String name;
    private int age;

    //Constructor
    public Person(String name,int age){
        this.setName(name);
        this.setAge(age);

    }

    //Metodo

    //Getter

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    //Setter
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if (age>0){
            this.age=age;
        }
        else {
            System.out.println("Edad no valida");
        }
    }


}
