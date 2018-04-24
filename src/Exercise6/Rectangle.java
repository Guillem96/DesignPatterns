package Exercise6;

public class Rectangle extends Figure {
    protected float width;
    protected float height;

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
}
