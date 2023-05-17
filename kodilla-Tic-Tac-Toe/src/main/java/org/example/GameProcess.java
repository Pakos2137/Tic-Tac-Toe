package org.example;

public class GameProcess{
    Board board;
    SettingsMenu settingsMenu;

    char actualMove = 'x';

    public GameProcess(Board board) {
        this.board = board;
    }

    public void choseProcess(SettingsMenu settingsMenu) {

        switch (settingsMenu.getBoardValue()) {
            case 3: if(settingsMenu.getPlayWithComputer() == true) {
                gameProcessWithComputer3x3();
                System.out.printf("Gracz X. Komputer O." + '\n' + "Zaczyna Gracz X:" + '\n');
            } else {
                gameProcessWithPlayer3x3();
                System.out.printf("Gracz1 X." +'\n' + "Gracz2 O." + '\n' + "Zaczyna Gracz X:" + '\n');
            }
            break;
            case 10: if(settingsMenu.getPlayWithComputer() == true) {
                gameProcessWithComputer10x10();
                System.out.printf("błąd");
            } else {
                gameProcessWithPlayer10x10();
                System.out.printf("błąd");
            }
            break;
        }
    }

    private void gameProcessWithPlayer3x3() {
        board.showBoard();

    }
    private void gameProcessWithComputer3x3() {
        board.showBoard();
    }
    private void gameProcessWithPlayer10x10() {
        board.showBoard();
    }
    private void gameProcessWithComputer10x10() {
        board.showBoard();
    }
}
