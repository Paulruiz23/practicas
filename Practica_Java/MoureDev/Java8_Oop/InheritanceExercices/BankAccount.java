package Java8_Oop.InheritanceExercices;

public class BankAccount {

    //Atributos
    protected double balance;

    //Constructor
    public BankAccount(double balance) {
        this.balance = balance;
    }

    //Metodo

    public void deposit(double cantidad) {
     if (cantidad>0){
         balance=balance+cantidad;
         System.out.println("Su nuevo balance es: "+balance);
     }
     else {
         System.out.println("Cantidad Invalida");
     }

    }
    public void withdraw(double cantidad){
        if (cantidad>0 && cantidad<= balance ){
            balance=balance-cantidad;
        System.out.println("Su nuevo balance es: "+balance);
    }
        else {
        System.out.println("Cantidad Invalida");
    }

    }
}
