package org.example;

public class Main {
    public static void main(String[] args) {
        SettingsMenu settingsMenu = new SettingsMenu();
        settingsMenu.appProcess();
        GameModeChoose gameProcessor = new GameModeChoose(settingsMenu.board);
        gameProcessor.choseProcess(settingsMenu);
    }
}