package Java8_Oop.ClassesExercices;

public class BankAccount {
    //Atributo
    int antiguoBalance=200;
    int Balance;

    //Constructor
    public BankAccount(int Balance){
        this.Balance=Balance;
    }

    //Metodo
    public void Saldo(){
        System.out.println("Su balance total es: "+(Balance+antiguoBalance));
    }
}
