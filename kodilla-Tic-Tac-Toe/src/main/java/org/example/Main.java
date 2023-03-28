package org.example;

public class Main {
    public static void main(String[] args) {
        Boolean gameInProgress = true;

        Board board = new Board();
        board.setBoard3x3();

        MoveProcessor moveProcessor = new MoveProcessor(board);
        WinLoseDraw_Check wns = new WinLoseDraw_Check();

        System.out.println("X zaczyna");

        while(gameInProgress) {
            board.showBoard();
            moveProcessor.move();
            moveProcessor.moveCheck(board.board);
            wns.WinLoseDraw_Check(board.board);
            gameInProgress = wns.WinLoseDraw_Exe(gameInProgress);
        }
        board.showBoard();
        wns.whoWin(moveProcessor);
    }
}