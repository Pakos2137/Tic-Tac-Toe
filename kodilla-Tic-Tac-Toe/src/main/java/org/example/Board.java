package org.example;

public class Board{
    char[][] board;
    public void setBoard3x3() {
        board = new char[][] {
                        {'1', '2', '3'},
                        {'4', '5', '6'},
                        {'7', '8', '9'}};
    }
    public void setBoard10x10() {
        for (int i = 0; i < 11; i++) {
            board = new char[i][0];
            for (int k = 0; k < 11; k++) {
                board = new char[i][k];
            }
        }
    }
    public void showBoard() {
        for (int row = 0; row < this.board.length; row++) {
            System.out.print("|");
            for (int column = 0; column < this.board[row].length; column++) {
                System.out.print(this.board[row][column] + "|");
            }
            System.out.println("");
        }
    }
}