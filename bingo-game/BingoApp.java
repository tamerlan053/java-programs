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

        for (int i = 0; i < bingoCards.length; i++) {
            for (int j = 0; j < 6; j++) {
                int randomNumber = random.nextInt(101);
                bingoCards[i].addNumber(randomNumber);
            }
        }

        for (int i = 0; i < bingoCards.length; i++) {
            System.out.println(bingoCards[i]);
        }

        boolean won = false;

        while (!won) {
            int checkerCard = random.nextInt(101);
            System.out.println("Number " + checkerCard + " drawn...");

            for (int i = 0; i < bingoCards.length; i++) {
                if (bingoCards[i].hasNumber(checkerCard)) {
                    System.out.println("BINGO!!");
                    System.out.println(bingoCards[i]);
                    won = true;
                }
            }
        }
    }
}
