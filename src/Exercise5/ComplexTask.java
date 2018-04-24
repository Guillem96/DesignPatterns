package Exercise5;

import java.util.ArrayList;
import java.util.List;

public abstract class ComplexTask implements Task {
    protected List<Task> tasks;

    public ComplexTask() {
        this.tasks = new ArrayList<>();
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

}
