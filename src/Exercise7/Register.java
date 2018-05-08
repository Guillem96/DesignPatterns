package Exercise7;

import Exercise7.Factories.SaleFactory;
import Exercise7.Sales.Sale;

import java.util.Observer;

public class Register {
    private Store store;
    private Sale currentSale;
    private SaleFactory factory;

    public Register(Store store, SaleFactory factory) {
        this.store = store;
        this.factory = factory;
    }

    public void createNewSale() {
        currentSale = factory.createSale();
    }

    public void addNewLine(ProductDescription productDescription, int quantity) {
        currentSale.createSalesLineItem(productDescription, quantity);
    }

    public void addSaleObserver(Observer o) {
        currentSale.addObserver(o);
    }

    // Valid per afegir observadors pero no tant bona com el mètode anterior
    public Sale getCurrentSale() {
        return currentSale;
    }

}
