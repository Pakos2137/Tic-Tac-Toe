package org.example;

public class GameProcess {
    Board board;

    private char actualMove = 'X';

    private boolean gameInProgress = true;

    public GameProcess(Board board) {
        this.board = board;
    }

    public void choseProcess(int boardSize,boolean playWithComputer) {


        switch (boardSize) {
            case 3:
                if (playWithComputer == true) {
                    gameProcessWithComputer3x3();
                    System.out.printf("Gracz X. Komputer O." + '\n' + "Zaczyna Gracz X:" + '\n');
                } else {
                    gameProcessWithPlayer3x3();
                    System.out.printf("Gracz1 X." + '\n' + "Gracz2 O." + '\n' + "Zaczyna Gracz X:" + '\n');
                }
                break;
            case 10:
                if (playWithComputer == true) {
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
        WinCheck winCheck = new WinCheck(board);
        MoveProcess moveProcess = new MoveProcess(board);
        while (gameInProgress) {
            defaultAction();
            moveProcess.takeMove();
            moveProcess.boardEditor3x3(actualMove);
            winCheck.gameResultCheck3x3();
            moveSwitch();
        }
    }

    private void gameProcessWithComputer3x3() {
        WinCheck winCheck = new WinCheck(board);
        MoveProcess moveProcess = new MoveProcess(board);
        while (gameInProgress) {
            defaultAction();
            moveProcess.takeMove();
            moveProcess.boardEditor3x3(actualMove);
            winCheck.gameResultCheck3x3();
            moveSwitch();
        }
    }

    private void gameProcessWithPlayer10x10()
    {
        MoveProcess moveProcess = new MoveProcess(board);
        while (gameInProgress) {
            defaultAction();
            moveProcess.takeMove();
            //moveProcess.boardEditor10x10(actualMove);
            moveSwitch();
        }
    }

    private void gameProcessWithComputer10x10() {
        MoveProcess moveProcess = new MoveProcess(board);
        while (gameInProgress) {
            defaultAction();
            moveProcess.takeMove();
            //moveProcess.boardEditor10x10(actualMove);
            moveSwitch();
        }
    }
    public void defaultAction() {
        board.showBoard();
        System.out.println("Ruch : " + actualMove);
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
