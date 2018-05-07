package Exercise7.Loggers;

import Exercise7.Sales.SLI;
import Exercise7.Sales.SalePull;

import java.util.Observable;

public class LoggerPull extends Logger {

    public LoggerPull(String logPath) {
        super(logPath);
    }

    @Override
    public void update(Observable observable, Object o) {
        SalePull s = (SalePull)observable;
        SLI sli = s.getLastSLI();

        String msg = sli.getProductDescription().getDescription() + " - " +
                sli.getQuantity() + " x " + sli.getProductDescription().getPrice() + "€" + "\n" +
                "Subtotal: " + s.getTotal() + "€\n";

        writeToLog(msg);
    }
}
