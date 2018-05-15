package Exercise18.UI;

import Exercise18.Client.Text;
import Exercise18.Interaction.FigureInteract;
import Exercise18.Interaction.TextInteract;

public class TextUI extends FigureUI {
    public TextUI(TextInteract interact) {}

    @Override
    public void display() {

    }

    @Override
    public void drop() {

    }

    @Override
    public FigureInteract getFigureInteractor() {
        return new TextInteract(this);
    }
}
