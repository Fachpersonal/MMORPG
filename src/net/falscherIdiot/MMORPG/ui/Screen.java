package net.falscherIdiot.MMORPG.ui;

import java.util.ArrayList;

public abstract class Screen {

    private static ArrayList<Screen> previousScreens;

    private String title;

    public Screen(String title) {
        previousScreens = new ArrayList<>();
        this.title = title;
    }

    public static ArrayList<Screen> getPreviousScreens() {
        return previousScreens;
    }

    public abstract void displayScreen();

    public String getTitle() {
        return title;
    }

}
