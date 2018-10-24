package BFactory;

import Factory.PartyFactory;

public class BankFactoryGenerator extends Factory.FactoryGenerator {
    @Override
    public Factory.AccountFactory makeAccountFactory() {
        return new BankAccountFactory();
    }

    @Override
    public Factory.TransactionFactory makeTransactionFactory() {
        return new BankTransactionFactory();
    }

    @Override
    public PartyFactory makePartyFactory() {
        return new BankPartyFactory();
    }
}
