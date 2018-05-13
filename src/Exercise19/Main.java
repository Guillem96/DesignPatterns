package Exercise19;

public class Main {
    public static void main(String[] args) {
        Drawing d = new Drawing(0,0);

        Line l = new Line(3, 6, 5, 10);
        Circle c = new Circle(4, 4, 2.5f);
        Rectangle r = new Rectangle(1, 5, 10, 3);

        d.addFigure(l);
        d.addFigure(c);
        d.addFigure(r);

        Scaler s = new Scaler(2);

        d.accept(s);
    }
}
