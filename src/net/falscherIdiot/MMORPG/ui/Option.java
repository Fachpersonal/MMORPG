package net.falscherIdiot.MMORPG.ui;

public class Option extends Action {

    private Screen screen;

    private String message;

    private int index;

    public Option(Screen screen, String message, int index) {
        this.screen = screen;
        this.message = message;
        this.index = index;
    }

    public String getMessage() {
        return message;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public void takeAction(Action.Type type) {
        if (type.equals(Action.Type.CLOSE_SCREEN)) {
            screen.getPreviousScreens(); // ! TODO: needs rework | (gets last screen and opens it & removes itself from
                                         // ! list)
        }
    }
}
