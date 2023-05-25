package org.example;

import java.util.Scanner;

public class MoveProcess {
    GameProcess gameProcess;

    private String move;

    Board board;

    public void takeMove(char actualMove) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(actualMove);
        move = scanner.next();
        System.out.println(move);
    }
}