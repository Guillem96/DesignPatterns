package Exercise7.Sales;

import Exercise7.ProductDescription;

import java.util.Observable;

public abstract class Sale extends Observable {
    public abstract void createSalesLineItem(ProductDescription desc, int quantity);
    public abstract int getTotal();
}