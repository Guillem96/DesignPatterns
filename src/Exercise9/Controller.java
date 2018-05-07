package Exercise9;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {

    public void createProject() {
        Paralel t = new Paralel();

        SimpleTask s1 = new SimpleTask(new Money(10), 50);
        SimpleTask s2 = new SimpleTask(new Money(3), 50);
        SimpleTask s3 = new SimpleTask(new Money(5), 50);

        // Add the controller and the complex task containing all the simple tasks as observers
        s1.addObserver(this);
        s1.addObserver(t);

        s2.addObserver(this);
        s2.addObserver(t);

        s3.addObserver(this);
        s3.addObserver(t);

        t.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Task finished");
    }
}
