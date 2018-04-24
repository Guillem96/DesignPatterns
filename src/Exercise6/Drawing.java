package Exercise6;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Figure {
    private List<Figure> figures = new ArrayList<>();

    Drawing(float x, float y) {
        super(x, y);
    }

    @Override
    public Figure deepCopy() {
        Drawing d = new Drawing(this.x, this.y);
        d.figures = new ArrayList<>();
        for (Figure f : this.figures) {
            d.figures.add(f.deepCopy());
        }
        return d;
    }

    public void addFigure(Figure f) {
        figures.add(f);
    }
}
