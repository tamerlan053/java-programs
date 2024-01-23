package packages.package15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoutsCalendarApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM yyyy");

        System.out.println("Enter the year");
        int year = scanner.nextInt();

        System.out.println("Enter the month number");
        int monthNumber = scanner.nextInt();

        System.out.println("Enter a day");
        int day = scanner.nextInt();

        ArrayList<Activity> activities = new ArrayList<>();

        while (day != 0 && activities.size() < 10) {
            System.out.println("Enter the activity");
            String activity = scanner.next();

            activities.add(new Activity(LocalDate.of(year, monthNumber, day), activity));

            System.out.println("Enter a day");
            day = scanner.nextInt();
            scanner.nextLine();
        }
    }
}
