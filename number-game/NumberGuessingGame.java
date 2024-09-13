import java.util.Random;

public class NumberGuessingGame {
    private int randomNumber;
    private int numberOfTries;
    private final int maxTries;

    public NumberGuessingGame(int maxTries) {
        Random random = new Random();
        this.randomNumber = random.nextInt(100) + 1;
        this.numberOfTries = 0;
        this.maxTries = maxTries;
    }

    public String makeGuess(int guess) {
        numberOfTries++;
        if (guess < randomNumber) {
            return "Your guess is too low.";
        } else if (guess > randomNumber) {
            return "Your guess is too high.";
        } else {
            return "correct";
        }
    }

    public boolean hasWon(int guess) {
        return guess == randomNumber;
    }

    public boolean hasMoreTries() {
        return numberOfTries < maxTries;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
