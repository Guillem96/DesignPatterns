package Exercise6;

public abstract class Figure {
    private float x;
    private float y;

    Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    Figure(Figure figure) {
        this.x = figure.x;
        this.y = figure.y;
    }

    public abstract Figure copy() ;

    public abstract Figure deepCopy();
}
