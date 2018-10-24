package BAccount;

import Account.Account;

import java.util.Date;

public class BankAccount extends Account {
    double interest = 0.5;

    public BankAccount(int actNo) {
        super(actNo);
    }

    public void addInterest()
    {
        double b = this.getBalance() + this.getBalance() * interest;
        this.addTransaction(new Interest(b, new Date()));

    }
}
