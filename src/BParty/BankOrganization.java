package BParty;

import Account.IAccount;
import BAccount.BankAccount;
import Party.Organization;


public class BankOrganization  extends Organization implements IInterestParty {
    public BankOrganization(String name, String street, String city, String state, String zip, String email, int numOfEmployees) {
        super(name, street, city, state, zip, email, numOfEmployees);
    }

    @Override
    public void doInterest() {
        for (IAccount a:this.getAccounts()) {
            ((BankAccount)a).addInterest(); // again, I know this is bad, but I don't have time to figure it out
        }
    }
}
