package BMediator;

import Application.IApplication;
import BApplication.BankApplication;
import Mediator.GUIMediator;

import Mediator.ModelConverter;

import javax.swing.table.DefaultTableModel;

public class BankGUIMediator extends GUIMediator {
    public BankGUIMediator(IApplication app) {
        super(app, null);
    }

    public BankApplication getApp()
    {
        return (BankApplication) app;
    }

    public void checkingAccountAdded(String custName, int actNo)
    {
        getApp().addCheckingAccount(custName, actNo);
    }

    public void savingsAccountAdded(String custName, int actNo)
    {
        getApp().addSavingsAccount(custName, actNo);
    }

    public void doDeposit(String custName, int actNo, double amount)
    {
        getApp().doDepositTransaction(custName, actNo, amount);
    }

    public void doWithdraw(String custName, int actNo, double amount)
    {
        getApp().doWithdrawTransaction(custName, actNo, amount);
    }

    public void doInterest()
    {
        getApp().doInterest();
    }

    public DefaultTableModel getModel()
    {
        return ModelConverter.createModel(app.getParties());
    }

}
