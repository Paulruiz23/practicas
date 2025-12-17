package Java8_Oop.PolymorphismExercices;


public class SavingsAccount extends BankAccount {
    //Atributos
    double interestRate;


    //Constructor
    public SavingsAccount(double Balance,double interestRate) {
        super(Balance);
        this.interestRate= interestRate;
    }

    //Metodo
    public void addInterest(){
        double interest = balance * interestRate;
        balance = balance + interest;
        System.out.println("Se añade intereses");
    }

}