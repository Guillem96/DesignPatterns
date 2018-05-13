package Exercise19;

public interface FigureVisitor {
    void visit(Rectangle f);
    void visit(ColorRectangle f);
    void visit(Circle f);
    void visit(Line f);
    void visit(Drawing f);
}
