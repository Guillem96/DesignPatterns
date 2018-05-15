package Exercise19;

public class Line extends Figure {
    public float getX2() {
        return x2;
    }

    public float getY2() {
        return y2;
    }

    private float x2;
    private float y2;

    public Line(float x, float y, float x2, float y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }


    public Line(Line l) {
        super(l);
        this.x2 = l.x2;
        this.y2 = l.y2;
    }

    @Override
    public Line copy() {
        return this;
    }

    @Override
    public Line deepCopy() {
        return new Line(this);
    }

    @Override
    public void accept(FigureVisitor visitor) {
        visitor.visit(this);
    }
}
