package Exericice6;

public class Rectangle extends Figure {
    protected float width;
    protected float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public Rectangle copy() {
        return new Rectangle(x, y, width, height);
    }
}
