package org.example;

public class ShowBoard {
    Board board;
    public void showBoard() {
        for(int i = 0; i < 9; i++) {

        }

        System.out.printf(
                "|" + field1 + "|" + field2 + "|" + field3 + "|" +'\n' +
                "|" + field4 + "|" + field5 + "|" + field6 + "|" +'\n' +
                "|" + field7 + "|" + field8 + "|" + field9 + "|" + '\n');
    }
}
