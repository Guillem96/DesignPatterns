package Exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class ComplexTask extends Task implements Observer {
    protected List<Task> tasks;
    private int done;
    private boolean finalized;

    public ComplexTask() {
        this.tasks = new ArrayList<>();
        this.done = 0;
        finalized = false;
    }


    public void addTask(Task task) {
        tasks.add(task);
        task.addObserver(this);
    }

    @Override
    public Money costInEuros() {
        Money m = new Money(0);

        for(Task t : tasks)
            m = m.add(t.costInEuros());

        return m;
    }

    @Override
    public abstract int durationInDays();

    @Override
    public boolean hasFinalized() {
        return finalized;
    }

    @Override
    public void update(Observable observable, Object o) {
        done += 1;
        if (done == tasks.size()) {
            finalized = true;
            setChanged();
            notifyObservers();
        }
    }
}
