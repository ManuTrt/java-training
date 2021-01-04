package code._4_student_effort._2_bank_transaction;

public class BankAccount {
    private String name;
    private double debit;

    public BankAccount(String name, double debit) {
        this.name = name;
        this.debit = debit;
    }

    void withdraw(double amount) throws InsufficientFundsException {
        longDatabaseCall();
        if (debit >= amount){
            debit -= amount;
            System.out.println("BankAccount: " + name + " amount after withdraw: " + debit);
        } else {
            throw new InsufficientFundsException();
        }
    }

    void deposit(double amount) {
        longDatabaseCall();
        debit += amount;
        System.out.println("BankAccount: " + name + " amount after deposit: " + debit);
    }

    void longDatabaseCall(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
