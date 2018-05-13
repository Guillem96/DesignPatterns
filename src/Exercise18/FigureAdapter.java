package Exercise18;

import Exercise18.Client.Figure;
import Exercise18.Interaction.FigureInteract;
import Exercise18.UI.FigureUI;

public abstract class FigureAdapter extends Figure {
    FigureUI ui;
    FigureInteract interact;

    @Override
    public void clickButtonOn() {
        interact.clickButtonOn();
    }

    @Override
    public void drag() {
        interact.drag();
    }

    @Override
    public void display() {
        ui.display();
    }

    @Override
    public void drop() {
        ui.drop();
    }

    @Override
    public void scale() {
        interact.scale();
    }

    @Override
    public void move() {
        interact.move();
    }
}
