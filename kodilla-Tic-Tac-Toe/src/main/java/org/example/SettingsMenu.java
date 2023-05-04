package org.example;

import java.util.Scanner;

public class SettingsMenu {
    boolean playWithComputer;
    private int boardValue;
    Board board = new Board();
    public void appProcess() {
        System.out.println("Witaj W Grze Kamień,Papier,Nożyce" + '\n');
        setWhoPlay();
        setBoardSize();
    }
    public void setWhoPlay() {
        System.out.println("Wybierz Grę z komputerem ( K ) lub z drugim graczem ( G ). ");
        Scanner whoPlayScan = new Scanner(System.in);
        String whoPlay = whoPlayScan.nextLine();
        whoPlay.toLowerCase();
        switch (whoPlay) {
            case "k": {
                System.out.println("Wybrano grę z komputerem");
                playWithComputer = true;
                break;
            }
            case "g": {
                System.out.println("Wybrano grę z graczem");
                playWithComputer = false;
                break;
            }
            default:
                System.out.print("Wybrano Nieporpwaną warość : " + whoPlay + '\n');
                setWhoPlay();
        }
    }
    public void setBoardSize() {
        System.out.println("Wybierz wielkość planszy 3 lub 10.");
        Scanner boardSizeScan = new Scanner(System.in);
        String boardSize = boardSizeScan.nextLine();
        switch (boardSize) {
            case "3": {
                boardValue = 3;
                board.setBoard3x3();
                System.out.println("Ustawino Wielkość planszy 3.");
                break;
            }
            case "10": {
                boardValue = 10;
                board.setBoard10x10();
                System.out.println("Ustawio Wielkość planszy 10.");
                break;
            }
            default:
                System.out.println("Wybrano Nieporpwaną warość : " + boardSize + '\n');
                setBoardSize();
        }
    }
}
