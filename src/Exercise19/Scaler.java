package Exercise19;

public class Scaler implements FigureVisitor {

    private int factor;
    private Figure scaled;

    public Scaler(int factor) {
        this.factor = factor;
    }

    @Override
    public void visit(Rectangle f) {
        scaled = new Rectangle(f.getX(), f.getY(), f.getHeight() * factor, f.getWidth() * factor);
    }

    @Override
    public void visit(ColorRectangle f) {
        scaled = new ColorRectangle(f.getX(), f.getY(), f.getHeight() * factor, f.getWidth() * factor, f.getColor());
    }

    @Override
    public void visit(Circle f) {
        scaled = new Circle(f.getX(), f.getY(), f.getR() * factor);
    }

    @Override
    public void visit(Line f) {
        float x2 = f.getX() + factor * (f.getX2() - f.getX());
        float y2 = f.getY() + factor * (f.getY2() - f.getY());

        scaled = new Line(f.getX(), f.getY(), x2, y2);
    }

    @Override
    public void visit(Drawing f) {
        scaled = new Drawing(f.getX(), f.getY());
        for(Figure figure : f.getFigures()) {
            Scaler scaler = new Scaler(this.factor);
            figure.accept(scaler);
            ((Drawing)scaled).getFigures().add(scaler.getScaled());
        }
    }

    public Figure getScaled() {
        return scaled;
    }
}
