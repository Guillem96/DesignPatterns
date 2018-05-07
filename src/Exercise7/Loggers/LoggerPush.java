package Exercise7.Loggers;

import Exercise7.Sales.SLI;
import Exercise7.Sales.Sale;

import java.util.Observable;

public class LoggerPush extends Logger {

    public LoggerPush(String logPath) {
        super(logPath);
    }

    @Override
    public void update(Observable observable, Object o) {
        SLI sli = (SLI) o;
        Sale s = (Sale) observable;

        String msg = sli.getProductDescription().getDescription() + " - " +
                sli.getQuantity() + " x " + sli.getProductDescription().getPrice() + "€" + "\n" +
                "Subtotal: " + s.getTotal() + "€\n";
        writeToLog(msg);
    }
}
