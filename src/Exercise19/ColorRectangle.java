package Exercise19;

import java.awt.*;

public class ColorRectangle extends Rectangle {
    public Color getColor() {
        return c;
    }

    private Color c;

    public ColorRectangle(float x, float y, float width, float height, Color c) {
        super(x, y, width, height);
        this.c = c;
    }

    public ColorRectangle(ColorRectangle cr) {
        super(cr);
        this.c = cr.c;
    }

    @Override
    public ColorRectangle deepCopy() {
        return new ColorRectangle(this);
    }

    @Override
    public void accept(FigureVisitor visitor) {
        visitor.visit(this);
    }
}
