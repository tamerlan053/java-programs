package packages.package8;

import java.util.Scanner;

public class ElevatorApp {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        elevator.setMaximumCapacity(5);
        elevator.setNumberOfFloors(11);
        System.out.println("""
                Make your choice:\s
                1. Go to floor ...
                2. Enter the elevator ...
                3. Exit the elevator...
                4. Quit""");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (choice != 4) {
            if (choice == 1) {
                System.out.print("Choose a floor: \n");
                int floor = scanner.nextInt();
                elevator.goTo(floor);
            } else if (choice == 2) {
                System.out.print("Number of people: \n");
                int numberOfPeople = scanner.nextInt();
                elevator.enter(numberOfPeople);
            } else if (choice == 3) {
                System.out.print("Number of people: \n");
                int numberOfPeople = scanner.nextInt();
                elevator.exit(numberOfPeople);
            } else {
                break;
            }
            System.out.println("""
                Make your choice:\s
                1. Go to floor ...
                2. Enter the elevator ...
                3. Exit the elevator...
                4. Quit""");
            choice = scanner.nextInt();
        }
    }
}
