package Exercise18.Interaction;

import Exercise18.UI.FigureUI;
import Exercise18.UI.RectangleUI;

public class RectangleInteract extends FigureInteract{
    public RectangleInteract(RectangleUI ui) {

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
        return new RectangleUI(this);
    }
}
