package Exercise9;

public class Money {

    private int value;

    public Money(int value) {
        this.value = value;
    }

    public Money add(Money m) {
        return new Money(this.value + m.value);
    }
}
