package org.example;
public class WinLoseDraw_Check {
    MoveProcessor moveProcessor;
    Board board;
    WinLoseDraw_Check wns;
    private boolean endGame = false;
    private int rounds = 0;

    public void WinLoseDraw_Check(char[][] board) {
        rounds++;

        if (board[0][0] == board[0][1] && board[0][2] == board[0][0]) {
            endGame = true;
        }
        if (board[1][0] == board[1][1] && board[1][2] == board[1][0]) {
            endGame = true;
        }
        if (board[2][0] == board[2][1] && board[2][2] == board[2][0]) {
            endGame = true;
        }
        if (board[0][0] == board[1][0] && board[2][0] == board[0][0]) {
            endGame = true;
        }
        if (board[1][0] == board[1][1] && board[1][2] == board[1][0]) {
            endGame = true;
        }
        if (board[2][0] == board[2][1] && board[2][2] == board[2][0]) {
            endGame = true;
        }
        if (board[0][0] == board[1][1] && board[2][2] == board[0][0]) {
            endGame = true;
        }
        if (board[0][2] == board[1][1] && board[2][0] == board[0][2]) {
            endGame = true;
        }
    }

    public boolean WinLoseDraw_Exe(Boolean gameInProgress) {
        if (rounds > 8) {
            return gameInProgress = false;
        }
        if (endGame == true) {
            return gameInProgress = false;
        } else {
            return gameInProgress = true;
        }
    }

    public void whoWin(MoveProcessor moveProcessor) {
        if (rounds > 8) {
            System.out.println("Remis");
        }
        if(endGame == true) {
            if (moveProcessor.getMove() == 'o') {
                System.out.println("X wygrał");
            }
            if (moveProcessor.getMove() == 'x') {
                System.out.println("O wygrał");
            }
        }
    }
}

