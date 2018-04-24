package Exercise6;

import java.awt.*;

public class ColorRectangle extends Rectangle {
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
}
