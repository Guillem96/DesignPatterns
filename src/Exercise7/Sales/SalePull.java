package Exercise7.Sales;

import Exercise7.ProductDescription;

import java.util.ArrayList;
import java.util.List;

public class SalePull extends Sale {
    private List<SLI> lines = new ArrayList<>();
    private SLI lastSLI;

    public void createSalesLineItem(ProductDescription desc, int quantity) {
        SLI sli = new SLI(desc, quantity);
        lines.add(sli);
        lastSLI = sli;
        setChanged();
        notifyObservers();
    }

    @Override
    public int getTotal() {
        int total = 0;

        for(SLI sli : lines) {
            total += sli.subTotal();
        }

        return total;
    }

    public SLI getLastSLI() {
        return lastSLI;
    }
}
