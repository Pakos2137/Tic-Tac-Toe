package org.example;

import java.util.Scanner;

public class MoveProcessor {
    private boolean x = true;
    private char chose;
    private String move;
    public MoveProcessor(Board board) {
    }
    public void move() {
        Scanner takeMove = new Scanner(System.in);
        if(x == true) {
            System.out.println("X: Wybierz Pole");
            chose = 'x';
            x = false;
        } else {
            System.out.println("O: Wybierz Pole");
            chose = 'o';
            x = true;
        }
        move = takeMove.nextLine();
    }
    public void moveCheck(char[][] board) {
        switch (move) {
            case "1" -> {
                if (board[0][0] != 'x' && board[0][0] != 'o') {
                    board[0][0] = chose;
                } else {
                    wrongMove();
                }
            }
            case "2" -> {
                if (board[0][1] != 'x' && board[0][1] != 'o') {
                    board[0][1] = chose;
                } else {
                    wrongMove();
                }
            }
            case "3" -> {
                if (board[0][2] != 'x' && board[0][2] != 'o') {
                    board[0][2] = chose;
                } else {
                    wrongMove();
                }
            }
            case "4" -> {
                if (board[1][0] != 'x' && board[1][0] != 'o') {
                    board[1][0] = chose;
                } else {
                    wrongMove();
                }
            }
            case "5" -> {
                if (board[1][1] != 'x' && board[1][1] != 'o') {
                    board[1][1] = chose;
                } else {
                    wrongMove();
                }
            }
            case "6" -> {
                if (board[1][2] != 'x' && board[1][2] != 'o') {
                    board[1][2] = chose;
                } else {
                    wrongMove();
                }
            }
            case "7" -> {
                if (board[2][0] != 'x' && board[2][0] != 'o') {
                    board[2][0] = chose;
                } else {
                    wrongMove();
                }
            }
            case "8" -> {
                if (board[2][1] != 'x' && board[2][1] != 'o') {
                    board[2][1] = chose;
                } else {
                    wrongMove();
                }
            }
            case "9" -> {
                if (board[2][2] != 'x' && board[2][2] != 'o') {
                    board[2][2] = chose;
                } else {
                    wrongMove();
                }
            }
            default -> System.out.println("Wybrano niepoporawną wartość");
        }
    }
    public void wrongMove() {
        System.out.println("Wybierz inne pole");
        if(x == true) {
            x=false;
        } else {
            x=true;
        }
    }
}
