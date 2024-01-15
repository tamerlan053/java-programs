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
    }
}
