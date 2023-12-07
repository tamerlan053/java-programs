package packages.package2;

import java.util.Scanner;

public class SwimmingPoolApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the swimming pool: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the swimming pool: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the depth of the swimming pool: ");
        double depth = scanner.nextDouble();

        SwimmingPool swimmingPool = new SwimmingPool();

        swimmingPool.setLength(length);
        swimmingPool.setWidth(width);
        swimmingPool.setDepth(depth);

        System.out.println("Liters of water: " + swimmingPool.getWaterVolume());
        System.out.println("Liters of disinfectant: " + swimmingPool.getDisinfectantVolume());
    }
}
