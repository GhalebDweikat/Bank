package BFactory;

import Account.Account;
import BAccount.*;

public class BankAccountFactory extends Factory.AccountFactory {
    @Override
    public Account makeAccount(String type, int actNo) {
        switch(type)
        {
            case "Checking":
                return new CheckingAccount(actNo);
            case "Savings":
                return new SavingsAccount(actNo);
            default:
                return new Account(actNo);

        }
    }
}
