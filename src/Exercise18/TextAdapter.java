package Exercise18;

import Exercise18.Interaction.TextInteract;
import Exercise18.UI.TextUI;

public class TextAdapter extends FigureAdapter {

    public TextAdapter() {
        ui = new TextUI();
        interact = new TextInteract();
    }
}
