package Exercise6;

public class Circle extends Figure {
    private float r;

    public Circle(float x, float y, float r) {
        super(x, y);
        this.r = r;
    }

    public Circle(Circle c) {
        super(c);
        this.r = c.r;
    }

    @Override
    public Circle copy() {
        // Serveix si les classes son inmutables
        return this;
    }

    @Override
    public Circle deepCopy() {
        return new Circle(this);
    }
}
