package code._4_student_effort._2_bank_transaction;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException() {
        super("Not enough money");
    }
}
