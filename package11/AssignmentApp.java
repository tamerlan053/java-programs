package packages.package11;

import java.util.Random;
import java.util.Scanner;

public class AssignmentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        double x = scanner.nextInt();

        Random random = new Random();
        double y = Math.round((random.nextDouble() * 6000.0) * 1000.0) / 1000.0;

        double result = Math.E * Math.sqrt(x * x + Math.pow(y, 3));
        System.out.printf("The result rounded to 3 decimal places: %.3f", result);
    }
}
