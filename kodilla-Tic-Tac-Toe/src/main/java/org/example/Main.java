package org.example;

public class Main {
    public static void main(String[] args) {
        SettingsMenu settingsMenu = new SettingsMenu();
        settingsMenu.appProcess();
        GameProcess gameProcessor = new GameProcess(settingsMenu.board);
        gameProcessor.choseProcess(settingsMenu);
    }
}