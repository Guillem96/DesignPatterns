package Exercise19;

import java.util.ArrayList;
import java.util.List;

public class Drawing extends Figure {
    public List<Figure> getFigures() {
        return figures;
    }

    private List<Figure> figures = new ArrayList<>();

    Drawing(float x, float y) {
        super(x, y);
    }

    Drawing(Drawing d) {
        super(d);
    }


    @Override
    public Drawing copy() {
        Drawing d = new Drawing(this);
        d.figures = this.figures;
        return d;
    }

    @Override
    public Figure deepCopy() {
        Drawing d = new Drawing(this);
        d.figures = new ArrayList<>();
        for (Figure f : this.figures) {
            d.figures.add(f.deepCopy());
        }
        return d;
    }

    public void addFigure(Figure f) {
        figures.add(f);
    }

    @Override
    public void accept(FigureVisitor visitor) {
        visitor.visit(this);
    }
}
