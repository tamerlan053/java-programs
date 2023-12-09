package packages.package3;

import java.util.Scanner;

public class FootballPlayerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Position: ");
            String position = scanner.next();

            System.out.print("Rating: ");
            int rating = scanner.nextInt();

            System.out.print("Goals: ");
            int goals = scanner.nextInt();
            scanner.nextLine();

            FootballPlayer footballPlayer = new FootballPlayer();

            footballPlayer.setName(name);
            footballPlayer.setAge(age);
            footballPlayer.setPlayerType(position);
            footballPlayer.setRating(rating);
            footballPlayer.setGoals(goals);

            System.out.printf("Price: %.2f%n", footballPlayer.getPrice());

            System.out.print("Name: ");
            name = scanner.nextLine();
        }
    }
}
