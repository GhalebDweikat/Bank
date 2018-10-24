package BAccount;

import Account.Transaction;

import java.util.Date;

public class Deposit extends Transaction {
    public Deposit(double amount, Date date) {
        super(amount, date);
    }
}
