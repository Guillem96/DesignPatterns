package Exericice6;

import java.awt.*;

public class ColorRectangle extends Rectangle {
    private Color c;

    public ColorRectangle(float x, float y, float width, float height, Color c) {
        super(x, y, width, height);
        this.c = c;
    }

    @Override
    public ColorRectangle copy() {
        return new ColorRectangle(x, y, width, height, c);
    }
}
