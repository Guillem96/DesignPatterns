package Exercise19;

public abstract class Figure {
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

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

    public abstract void accept(FigureVisitor visitor);
}
