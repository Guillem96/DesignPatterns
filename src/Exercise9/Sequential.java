package Exercise9;

public class Sequential extends ComplexTask {

    @Override
    public int durationInDays() {
        int duration = 0;

        for(Task t : tasks)
            duration += t.durationInDays();

        return duration;
    }
}
