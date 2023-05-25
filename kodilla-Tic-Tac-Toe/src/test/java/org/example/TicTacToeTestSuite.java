package org.example;

import org.example.Board;
import org.example.SettingsMenu;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTestSuite {
    SettingsMenu settingsMenu = new SettingsMenu();
    Board board = new Board();

    @Test
    public void createBoard3x3test() {
        board.setBoard3x3();
        assertEquals(board.board.length, 3);
    }
    @Test
    public void createBoard10x10test() {
        board.setBoard10x10();
        assertEquals(board.board.length, 10);
    }
}
