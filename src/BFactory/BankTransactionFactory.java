package BFactory;


import Account.ITransaction;
import Account.Transaction;
import BAccount.*;

import java.util.Date;

public class BankTransactionFactory extends Factory.TransactionFactory {
    @Override
    public ITransaction makeTransaction(String type, double amount, Date date) {
        switch(type)
        {
            case "Deposit":
                return new Deposit(amount, date);
            case "Withdraw":
                return new Withdraw(amount, date);
            case "Interest":
                return new Interest(amount, date);
            default:
                return new Transaction(amount, date);
        }
    }
}
