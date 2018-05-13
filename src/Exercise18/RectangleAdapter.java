package Exercise18;

import Exercise18.Interaction.RectangleInteract;
import Exercise18.UI.RectangleUI;

public class RectangleAdapter extends FigureAdapter {

    public RectangleAdapter() {
        ui = new RectangleUI();
        interact = new RectangleInteract();
    }
}
