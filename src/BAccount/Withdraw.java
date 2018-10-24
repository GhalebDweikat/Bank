package BAccount;

import Account.Transaction;

import java.util.Date;

public class Withdraw extends Transaction {
    public Withdraw(double amount, Date date) {
        super(amount, date);
    }
}
