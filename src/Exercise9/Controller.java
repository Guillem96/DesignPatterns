package Exercise9;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {

    public void createProject() {
        Paralel t = new Paralel();

        SimpleTask s1 = new SimpleTask(new Money(10), 50);
        SimpleTask s2 = new SimpleTask(new Money(3), 50);
        SimpleTask s3 = new SimpleTask(new Money(5), 50);
        t.addTask(s2);
        t.addTask(s1);
        t.addTask(s3);
        t.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Task finished");
    }
}
