package Exercise9;

public class SimpleTask extends Task {

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
        if (!finalized) {
            setChanged();
            notifyObservers();
            finalized = true;
        }
    }

    @Override
    public boolean hasFinalized() {
        return finalized;
    }
}
