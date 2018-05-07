package Exercise7.Factories;

import Exercise7.Sales.Sale;
import Exercise7.Sales.SalePush;

public class SalePushFactory implements SaleFactory{
    public Sale createSale() {
        return new SalePush();
    }
}
