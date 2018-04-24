package Exercise6;

public class Rectangle extends Figure {
    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public Rectangle deepCopy() {
        return new Rectangle(x, y, width, height);
    }
}
