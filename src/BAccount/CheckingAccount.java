package BAccount;

public class CheckingAccount extends BankAccount {
    double interest = 0.01;

    public CheckingAccount(int actNo) {
        super(actNo);
    }
}
