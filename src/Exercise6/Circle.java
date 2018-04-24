package Exercise6;

public class Circle extends Figure {
    private float r;

    public Circle(float x, float y, float r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public Circle deepCopy() {
        return new Circle(x, y, r);
    }
}
