package org.example;

import javax.print.DocFlavor;
import java.util.Objects;
import java.util.Scanner;

public class MoveProcess {
    GameProcess gameProcess;

    private int move;

    private int boardType;

    Board board;


    public MoveProcess(Board board) {
        this.board = board;
    }

    public void takeMove() {
        if (board.board.length == 3) {
            boardType = 9;
        } else {
            boardType = 100;
        }

        if (move < boardType) {
            Scanner scanner = new Scanner(System.in);
            move = scanner.nextInt();
            System.out.println(move);
        }
    }

    public char boardEditor3x3(char actualMove) {
        int moveValue = move;
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                move--;
                if (move == 0) {
                    String boardValue = board.board[i][k];
                    if (Objects.equals(String.valueOf(boardValue), String.valueOf(moveValue))) {
                        board.board[i][k] = String.valueOf(actualMove);
                    } else {
                        System.out.println("To Pole zostało juz wybrane:");
                    }
                }
            }
        }
        return actualMove;
    }
    /*
    public void boardEditor10x10(char actualMove) {
        int moveValue = move;
        for (int i = 0; i < 10; i++) {
            for (int k = 1; k < 10; k++) {
                move--;
                if (move == 0) {
                    String boardValue = board.board[i][k];
                    System.out.println(moveValue);
                    if (Objects.equals(String.valueOf(boardValue), String.valueOf(moveValue))) {
                        board.board[i][k] = String.valueOf(actualMove);
                    } else {
                        System.out.println("To Pole zostało juz wybrane:");
                    }
                }
            }
        }
    }

     */
}