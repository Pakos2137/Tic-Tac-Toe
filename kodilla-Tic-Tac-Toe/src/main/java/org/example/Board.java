package org.example;

public class Board {
    char[][] board =
            {{'1', '2', '3'},
             {'4', '5', '6'},
             {'7', '8', '9'}};

    public void showBoard() {
        for (int row = 0; row < board.length; row++) {
            System.out.print("|");
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column] + "|");
            }
            System.out.println("");
        }
    }
}
