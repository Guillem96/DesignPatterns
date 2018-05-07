package Exercise7;

import Exercise7.Factories.SaleFactory;
import Exercise7.Sales.Sale;

public class Register {
    private Store store;
    private Sale currentSale;
    private SaleFactory factory;

    public Register(Store store, SaleFactory factory) {
        this.store = store;
        this.factory = factory;
    }

    public Sale createNewSale() {
        currentSale = factory.createSale();
        return currentSale;
    }

    public void addNewLine(ProductDescription productDescription, int quantity) {
        currentSale.createSalesLineItem(productDescription, quantity);
    }
}
