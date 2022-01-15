package net.falscherIdiot.MMORPG.ui;

public abstract class Action {

    public static enum Type {
        NEW_SCREEN, CLOSE_SCREEN
    }

    public abstract void takeAction(Action.Type type);
}
