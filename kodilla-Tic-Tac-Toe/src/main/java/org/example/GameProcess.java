package org.example;

public class GameProcess {
    Board board;
    SettingsMenu settingsMenu;

    private char actualMove = 'X';

    private boolean gameInProgress = true;

    public GameProcess(Board board) {
        this.board = board;
    }

    public void choseProcess(int boardSize,boolean player) {

        switch (boardSize) {
            case 3:
                if (player == true) {
                    gameProcessWithComputer3x3();
                    System.out.printf("Gracz X. Komputer O." + '\n' + "Zaczyna Gracz X:" + '\n');
                } else {
                    gameProcessWithPlayer3x3();
                    System.out.printf("Gracz1 X." + '\n' + "Gracz2 O." + '\n' + "Zaczyna Gracz X:" + '\n');
                }
                break;
            case 10:
                if (player == true) {
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
        MoveProcess moveProcess = new MoveProcess(board);
        while (gameInProgress) {
            board.showBoard();
            System.out.println("Ruch : " + actualMove);
            moveProcess.takeMove();
            moveProcess.boardEditor3x3(actualMove);
            moveSwitch();
        }
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
    public char moveSwitch() {
        if (getActualMove() == 'X') {
            setActualMove('O');
        } else {
            setActualMove('X');
        }
        return actualMove;
    }
    public char getActualMove() {
        return actualMove;
    }
    public void setActualMove(char actualMove) {
        this.actualMove = actualMove;
    }

}
