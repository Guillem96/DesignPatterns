package Exercise7.Sales;

import Exercise7.ProductDescription;

import java.util.ArrayList;
import java.util.List;

public class SalePush extends Sale {
    private List<SLI> lines = new ArrayList<>();

    public void createSalesLineItem(ProductDescription desc, int quantity) {
        SLI sli = new SLI(desc, quantity);
        lines.add(sli);
        setChanged();
        notifyObservers(sli); // Pushing the new sale line
    }

    @Override
    public int getTotal() {
        int total = 0;

        for(SLI sli : lines) {
            total += sli.subTotal();
        }

        return total;
    }
}
