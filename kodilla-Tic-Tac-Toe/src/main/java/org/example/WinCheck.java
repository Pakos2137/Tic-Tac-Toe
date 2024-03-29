package org.example;

import java.util.ArrayList;
import java.util.List;

public class WinCheck {
    Board board;

    String result = "";

    public WinCheck(Board board) {
        this.board = board;
    }
    public void gameResultCheck3x3() {
        boardToListsConverter();
        winMessage();
    }

    private void boardToListsConverter() {
        List rowsList = new ArrayList<>();
        List columnList = new ArrayList<>();

        for(int i = 0 ; i < 3 ;i++) {
            for(int k = 0 ; k < 3 ;k++) {
                rowsList.add(board.board[i][k]);
                result += board.board[i][k];
            }
            System.out.println("list rows : " + rowsList);
            rowsList.removeAll(rowsList);
            result = "";
            for(int k = 0 ; k < 3 ;k++) {
                columnList.add(board.board[k][i]);
                result += board.board[k][i];
            }
            System.out.println("list column : " + columnList);
            columnList.removeAll(columnList);
            result = "";
        }
    }
    private void winMessage() {
        if(result.equals("XXX")) {
            System.out.println("X wygrał");
        }
        if(result.equals("OOO")) {
            System.out.println("O wygrał");
        }
    }
}
