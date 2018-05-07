package Exercise7;

import Exercise7.Factories.SaleFactory;
import Exercise7.Loggers.Logger;
import Exercise7.Sales.Sale;

public class Controller {

    private Logger logger;
    private Register register;

    public Controller(Logger l, SaleFactory factory, Store store) {
        logger = l;
        register = new Register(store, factory);
    }

    public void startSale() {
        Sale sale = register.createNewSale();
        sale.addObserver(logger);
    }

    public void addNewItem(ProductDescription pd, int q) {
        register.addNewLine(pd, q);
    }
}
