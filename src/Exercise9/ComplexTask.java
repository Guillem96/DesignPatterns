package Exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class ComplexTask extends Observable implements Task, Observer {
    protected List<Task> tasks;
    private int done;

    public ComplexTask() {
        this.tasks = new ArrayList<>();
        this.done = 0;
    }


    public void addTask(Task task) {
        tasks.add(task);
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
        if (done == tasks.size()) {
            notifyObservers();
            return true;
        }
        return false;
    }

    @Override
    public void update(Observable observable, Object o) {
        done += 1;
    }
}
