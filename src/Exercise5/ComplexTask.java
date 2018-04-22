package Exercise5;

import java.util.ArrayList;
import java.util.List;

public class ComplexTask implements Task {
    private List<Task> tasks;

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
    public int durationInDays() {
        int duration = 0;

        for(Task t : tasks)
            duration += t.durationInDays();

        return duration;
    }

}
