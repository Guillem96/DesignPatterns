package Exericice6;

public abstract class Figure {
    private float x;
    private float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract Figure copy();
}
