package org.example;

import java.util.Scanner;

public class FirstMenu {
    Board board;
    private boolean firstChoseComplete = true;
    private boolean secondChoseComplete = true;

    public FirstMenu(Board board,boolean playWithComputer,int boardSize) {
        this.board = board;
    }
    public void choseMenu() {
        System.out.println("Witaj W grze Kamień, Papier, Nożyce");

        System.out.println("Jeśli chcesz zagrać z komputerem wybierz K");
        System.out.println("Jeśli chcesz zagrać z przeciwnikiem wybierz P");

        while(firstChoseComplete) {
            Scanner takeChose = new Scanner(System.in);
        }
    }
}
