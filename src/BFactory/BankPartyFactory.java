package BFactory;

import BParty.BankOrganization;
import BParty.BankPerson;
import Factory.PartyFactory;
import Party.IParty;

public class BankPartyFactory extends PartyFactory {
    @Override
    public IParty makePerson(String name, String street, String city, String state, String zip, String email, String dateOfBirth) {
        return new BankPerson(name, street, city, state, zip, email, dateOfBirth);
    }

    @Override
    public IParty makeOrganization(String name, String street, String city, String state, String zip, String email, int numOfEmployees) {
        return new BankOrganization(name, street, city, state, zip, email, numOfEmployees);
    }
}
