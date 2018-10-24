package BApplication;

import BFactory.BankFactoryGenerator;
import BMediator.BankGUIMediator;
import BParty.IInterestParty;
import Factory.FactoryGenerator;
import Mediator.IGUIMediator;
import Party.IParty;

public class BankApplication extends Application.Application {



    public void addCheckingAccount(String custName, int actNo) {
        super.addAccount(custName, "Checking", actNo);
    }

    public void addSavingsAccount(String custName, int actNo) {
        super.addAccount(custName, "Savings", actNo);
    }

    public void doDepositTransaction(String custNo, int actNo, double amount)
    {
        super.doTransaction(custNo, actNo, "Deposit", amount);
    }

    public void doWithdrawTransaction(String custNo, int actNo, double amount) {
        super.doTransaction(custNo, actNo, "Withdraw", amount);
    }

    public void doInterest()
    {
        for (IParty p: this.getParties()) {
            ((IInterestParty)p).doInterest(); // this is bad too
        }
    }

    public BankGUIMediator getMediator() {
        return mediator;
    }

    BankGUIMediator mediator;


    @Override
    public void init() {
        super.init();

       mediator = new BankGUIMediator(this);
//        medStrat = new CurrentMediatorStrategy(mediator);
    }
}
