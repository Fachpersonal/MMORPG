package net.falscherIdiot.MMORPG.ui;

import java.util.ArrayList;

//! TODO: Needs work | Fully implement Screen
public class Screen {

    private ArrayList<Screen> previousScreens;

    public Screen() {
        previousScreens = new ArrayList<>();
    }

    public ArrayList<Screen> getPreviousScreens() {
        return previousScreens;
    }

}
