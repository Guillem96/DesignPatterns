package Exercise7.Factories;

import Exercise7.Sales.Sale;
import Exercise7.Sales.SalePull;

public class SalePullFactory implements SaleFactory{
    @Override
    public Sale createSale() {
        return new SalePull();
    }
}
