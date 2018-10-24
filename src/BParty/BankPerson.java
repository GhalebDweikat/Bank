package BParty;

import Account.IAccount;
import BAccount.BankAccount;
import Party.Person;

public class BankPerson extends Person implements IInterestParty {
    public BankPerson(String name, String street, String city, String state, String zip, String email, String dateOfBirth) {
        super(name, street, city, state, zip, email, dateOfBirth);
    }

    @Override
    public void doInterest() {
        for (IAccount a:this.getAccounts()) {
            ((BankAccount)a).addInterest(); // again, I know this is bad, but I don't have time to figure it out
        }
    }
}
