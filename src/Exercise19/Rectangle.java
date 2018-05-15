package Exercise19;

public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public Rectangle(Rectangle r) {
        super(r);
        this.height = r.height;
        this.width = r.width;
    }

    @Override
    public Rectangle copy() {
        return this;
    }

    @Override
    public Rectangle deepCopy() {
        return new Rectangle(this);
    }

    @Override
    public void accept(FigureVisitor visitor) {
        visitor.visit(this);
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }
}
