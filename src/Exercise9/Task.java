package Exercise9;

import java.util.Observable;

public abstract class Task extends Observable {
    abstract Money costInEuros();
    abstract int durationInDays();
    abstract boolean hasFinalized();
}
