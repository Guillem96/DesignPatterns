package Exercise9;

import java.util.Observable;

public class SimpleTask extends Observable implements Task {

    private Money cost;
    private int duration;
    private boolean finalized;

    public SimpleTask(Money cost, int duration) {
        this.cost = cost;
        this.duration = duration;
        this.finalized = false;
    }

    @Override
    public Money costInEuros() {
        return cost;
    }

    @Override
    public int durationInDays() {
        return duration;
    }

    public void finalize() {
        notifyObservers();
        finalized = true;
    }

    @Override
    public boolean hasFinalized() {
        return finalized;
    }
}
