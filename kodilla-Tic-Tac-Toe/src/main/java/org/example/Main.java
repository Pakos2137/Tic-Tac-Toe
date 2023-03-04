package org.example;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        ShowBoard showBoard = new ShowBoard();
        showBoard.showBoard();
    }
}