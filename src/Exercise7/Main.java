package Exercise7;

import Exercise7.Factories.SalePullFactory;
import Exercise7.Factories.SalePushFactory;
import Exercise7.Loggers.Logger;
import Exercise7.Loggers.LoggerPull;
import Exercise7.Loggers.LoggerPush;

public class Main {

    public static void main(String[] args) {
        pull();
        push();
    }

    private static void pull() {
        Logger l = new LoggerPull("resources/log-pull.txt");
        Register r = new Register(new Store("Pull Store"), new SalePullFactory());
        r.createNewSale();
        r.addSaleObserver(l);
        r.addNewLine(new ProductDescription("Milk", 10), 2);
        r.addNewLine(new ProductDescription("Froot Loops", 20), 3);
        l.close();
    }

    private static void push() {
        Logger l = new LoggerPull("resources/log-pull.txt");
        Register r = new Register(new Store("Push Store"), new SalePushFactory());
        r.createNewSale();
        r.addSaleObserver(l);
        r.addNewLine(new ProductDescription("Milk", 10), 2);
        r.addNewLine(new ProductDescription("Froot Loops", 20), 3);
        l.close();
    }
}
