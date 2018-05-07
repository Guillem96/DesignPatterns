package Exercise9;

import java.util.Observable;

public class Paralel extends ComplexTask {
    @Override
    public int durationInDays() {
        int duration = 0;

        for(Task t : tasks)
            duration = duration > t.durationInDays() ? duration : t.durationInDays();

        return duration;
    }
}
