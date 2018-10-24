import BApplication.BankApplication;
import BFactory.BankFactoryGenerator;
import BGUI.BankFrm;
import BMediator.BankGUIMediator;
import Mediator.IGUIMediator;

import javax.swing.*;

public class Main {
//    public static void main(String[] args)
//    {
//        BankApplication app = new BankApplication();
//        app.setBaseFactory(new BankFactoryGenerator());
//    }

    static public void main(String args[])
    {
        try {
            // Add the following code if you want the Look and Feel
            // to be set to the Look and Feel of the native system.

            BankApplication app = new BankApplication();
            app.setBaseFactory(new BankFactoryGenerator());
            app.init();
            BankGUIMediator med = app.getMediator();

            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
            catch (Exception e) {
            }

            BankFrm bf = new BankFrm();
            bf.setMediator(med);
            //Create a new instance of our application's frame, and make it visible.
            bf.setVisible(true);
        }
        catch (Throwable t) {
            t.printStackTrace();
            //Ensure the application exits with an error condition.
            System.exit(1);
        }
    }
}
