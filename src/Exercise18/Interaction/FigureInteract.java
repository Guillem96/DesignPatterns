package Exercise18.Interaction;

import Exercise18.UI.FigureUI;

public abstract class FigureInteract {
    public abstract void move();
    public abstract void scale();
    public abstract void clickButtonOn();
    public abstract void drag();
    public abstract FigureUI getUI();
}
