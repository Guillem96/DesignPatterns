package Exercise6;

public abstract class Figure {
    protected float x;
    protected float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Figure copy() {
        return this;
    }

    public abstract Figure deepCopy();
}
