package net.falscherIdiot.MMORPG.ui;

public class Content extends Action {

    private Screen screen;

    private String message;

    private int index;

    public Content(Screen screen, String message, int index) {
        this.screen = screen;
        this.message = message;
        this.index = index;
    }

    public String displayContent() {
        return "[" + index + "]" + message;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public void takeAction(Action.Type type) {
        if (type.equals(Action.Type.OPEN_SCREEN)) {

        } else if (type.equals(Action.Type.CLOSE_SCREEN)) {
            Screen tmp = Screen.getPreviousScreens().get(Screen.getPreviousScreens().size() - 1);
            Screen.getPreviousScreens().remove(tmp);
            tmp.displayScreen();
        }
    }
}
