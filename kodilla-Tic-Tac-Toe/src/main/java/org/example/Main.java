package org.example;

public class Main {
    public static void main(String[] args) {
        boolean game = true;
        Board board = new Board();
        MoveProcessor moveProcessor = new MoveProcessor(board);
        WinLoseDraw_Check wns = new WinLoseDraw_Check();
        board.showBoard();
        System.out.println("X zaczyna");
        while(game) {
            moveProcessor.move();
            moveProcessor.moveCheck(board.board);
            board.showBoard();
            wns.WinLoseDraw_Check(board.board,game);
        }
    }
}