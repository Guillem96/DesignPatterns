package Exercise18.Interaction;

import Exercise18.UI.FigureUI;
import Exercise18.UI.TextUI;

public class TextInteract extends FigureInteract {
    public TextInteract(TextUI ui) {

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
        return new TextUI(this);
    }
}
