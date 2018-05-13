package Exercise18;

import Exercise18.Interaction.LineInteract;
import Exercise18.UI.LineUI;

public class LineAdapter extends FigureAdapter {

    public LineAdapter() {
        ui = new LineUI();
        interact = new LineInteract();
    }
}
