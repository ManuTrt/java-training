package code._4_student_effort._2_bank_transaction;

public class TransactionThread extends Thread {
    private String name;
    private BankAccount from, to;
    private double amount;

    public TransactionThread(String name, BankAccount from, BankAccount to, double amount){
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    @Override
    public void run() {
        transfer(from, to, amount);
    }

    private void transfer(BankAccount from, BankAccount to, double amount){
        try {
            synchronized (from) {
                from.withdraw(amount);
            }
            synchronized (to) {
                to.deposit(amount);
            }
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }
    }
}
