package Exercise18.Interaction;

import Exercise18.UI.FigureUI;
import Exercise18.UI.LineUI;

public class LineInteract extends FigureInteract {

    public LineInteract(LineUI ui) {

    }

    @Override
    public void move() {

    }

    @Override
    public void scale() {

    }

    @Override
    public void clickButtonOn() {

    }

    @Override
    public void drag() {

    }

    @Override
    public FigureUI getUI() {
        return new LineUI(this);
    }
}
