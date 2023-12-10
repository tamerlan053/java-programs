package packages.package4;

import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of adults: ");
        int adults = scanner.nextInt();

        System.out.print("Enter the number of children: ");
        int children = scanner.nextInt();

        System.out.print("Enter a hotel code: ");
        String hotelCode = scanner.next();

        String output = "";

        while (!hotelCode.equals("/")) {
            System.out.print("Enter the number of stars: ");
            int starCount = scanner.nextInt();

            System.out.print("Enter a child code: ");
            char childCode = scanner.next().charAt(0);

            Hotel hotel = new Hotel();

            hotel.setHotelCode(hotelCode);
            hotel.setStarCount(starCount);
            hotel.setChildCode(childCode);

            double total = adults * hotel.getPrice() + children * hotel.getChildPrice();

            output += String.format("%s%5s %.2f %.2f %.2f %n", hotelCode, hotel.getStars(), hotel.getPrice(), hotel.getChildPrice(), total);

            System.out.print("Enter a hotel code: ");
            hotelCode = scanner.next();
        }

        System.out.println(output);
    }
}
