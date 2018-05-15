package Exercise18.UI;

import Exercise18.Interaction.FigureInteract;
import Exercise18.Interaction.LineInteract;

public class LineUI extends FigureUI {
    public LineUI(LineInteract interact) {

    }

    @Override
    public void display() {

    }

    @Override
    public void drop() {

    }

    @Override
    public FigureInteract getFigureInteractor() {
        return new LineInteract(this);
    }
}
