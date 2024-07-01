package bingo;

import java.util.Random;

public class BingoApp {
    public static void main(String[] args) {
        Bingo[] bingoCards = new Bingo[5];
        Random random = new Random();

        bingoCards[0] = new Bingo("Jason");
        bingoCards[1] = new Bingo("Matt");
        bingoCards[2] = new Bingo("Willems");
        bingoCards[3] = new Bingo("John");
        bingoCards[4] = new Bingo("Brad");
    }
}
