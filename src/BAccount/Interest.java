package BAccount;

import Account.Transaction;

import java.util.Date;

public class Interest extends Transaction {
    public Interest(double amount, Date date) {
        super(amount, date);
    }
}
