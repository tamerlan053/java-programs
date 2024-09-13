
import java.util.Scanner;

public class NumberGuessingGameApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberGuessingGame game = new NumberGuessingGame(10);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess a number between 1 and 100.");

        boolean gameWon = false;
        while (!gameWon && game.hasMoreTries()) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            String feedback = game.makeGuess(guess);
            
            if (feedback.equals("correct")) {
                gameWon = true;
                System.out.println("Congratulations! You've guessed the number " + game.getRandomNumber() + " in " + game.getNumberOfTries() + " tries.");
            } else {
                System.out.println(feedback);
            }
        }

        if (!gameWon) {
            System.out.println("Sorry, you've used all your attempts. The correct number was " + game.getRandomNumber() + ".");
        }

        scanner.close();
    }
}
