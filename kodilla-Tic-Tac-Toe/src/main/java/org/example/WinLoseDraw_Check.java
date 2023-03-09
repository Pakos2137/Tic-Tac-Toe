package org.example;

public class WinLoseDraw_Check {
    public boolean WinLoseDraw_Check(char[][] board,Boolean game) {
        if(board[0][0] == board[0][1] && board[0][2] == board[0][0]) {
            System.out.printf("Wygrałeś");
            game = false;
        }
        if(board[1][0] == board[1][1] && board[1][2] == board[1][0]) {
            System.out.printf("Wygrałeś");
            game = false;
        }
        if(board[2][0] == board[2][1] && board[2][2] == board[2][0]) {
            System.out.printf("Wygrałeś");
            game = false;
        }
        if(board[0][0] == board[1][0] && board[2][0] == board[0][0]) {
            System.out.printf("Wygrałeś");
            game = false;
        }
        if(board[1][0] == board[1][1] && board[1][2] == board[1][0]) {
            System.out.printf("Wygrałeś");
            game = false;
        }
        if(board[2][0] == board[2][1] && board[2][2] == board[2][0]) {
            System.out.printf("Wygrałeś");
            game = false;
        }
        if(board[0][0] == board[1][1] && board[2][2] == board[0][0]) {
            System.out.printf("Wygrałeś");
            game = false;
        }
        if(board[0][2] == board[1][1] && board[2][0] == board[0][2]) {
            System.out.printf("Wygrałeś");
            game = false;
        }
        return game;
    }
}
