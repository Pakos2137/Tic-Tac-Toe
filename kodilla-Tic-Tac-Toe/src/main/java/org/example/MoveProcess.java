package org.example;

import java.util.Scanner;

public class MoveProcess {
    GameProcess gameProcess;

    private int move;

    private int boardType;

    Board board;

    public void takeMove(char actualMove) {
        if(this.board.board.length == 3) {
            boardType = 9;
        } else {
            boardType = 100;
        }

        if(move > boardType) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(actualMove);
            move = scanner.nextInt();
            System.out.println(move);
        }
    }
    public void boardEditor3x3() {
    }
}