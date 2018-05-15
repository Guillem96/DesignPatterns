package Exercise18.UI;

import Exercise18.Interaction.FigureInteract;
import Exercise18.Interaction.RectangleInteract;

public class RectangleUI extends FigureUI {
    public RectangleUI(RectangleInteract interact) {

    }

    @Override
    public void display() {

    }

    @Override
    public void drop() {

    }

    @Override
    public FigureInteract getFigureInteractor() {
        return new RectangleInteract(this);
    }
}
