package packages.package13;

import java.util.Random;

public class BingoApp {
    public static void main(String[] args) {
        Bingo[] bingoCards = new Bingo[5];
        Random random = new Random();

        bingoCards[0] = new Bingo("Sam");
        bingoCards[1] = new Bingo("Sander");
        bingoCards[2] = new Bingo("Nele");
        bingoCards[3] = new Bingo("Nick");
        bingoCards[4] = new Bingo("Matt");

        for (int i = 0; i < bingoCards.length; i++) {
            for (int j = 0; j < 6; j++) {
                int randomNumber = random.nextInt(100);
                bingoCards[i].addNumber(randomNumber);
            }
        }

         for (int i = 0; i < bingoCards.length; i++) {
            System.out.println(bingoCards[i]);
        }

        boolean won = false;

        while (!won) {
            int checkedNumber = random.nextInt(100);
            System.out.println("Number " + checkedNumber + " drawn...");

            for (int i = 0; i < bingoCards.length; i++) {
                if (bingoCards[i].hasNumber(checkedNumber)) {
                    System.out.println("BINGO!!");
                    System.out.println(bingoCards[i]);
                    won = true;
                }
            }
        }
    }
}
