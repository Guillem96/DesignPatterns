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
        Controller c = new Controller(l, new SalePullFactory(), new Store("Mercadona"));
        c.startSale();
        c.addNewItem(new ProductDescription("Milk", 10), 2);
        c.addNewItem(new ProductDescription("Froot Loops", 20), 3);
        l.close();
    }

    private static void push() {
        Logger l = new LoggerPush("resources/log-push.txt");
        Controller c = new Controller(l, new SalePushFactory(), new Store("Eroski"));
        c.startSale();
        c.addNewItem(new ProductDescription("Milk", 10), 2);
        c.addNewItem(new ProductDescription("Froot Loops", 20), 3);
        l.close();
    }
}
