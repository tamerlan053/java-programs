package packages.package6;

public class PhoneApp {
    public static void main(String[] args) {
        Phone phone = new Phone();

        phone.setNumber("0123456789");
        phone.setProvider("Floximus");
        phone.setNumberOfFreeCalls(5);

        for (int i = 10; i <= 30; i++) {
            phone.call("0121234" + i);
        }

        phone.call("0702245245");

        System.out.printf("Phone cost: €%.2f%n", phone.getCost());

        phone.reset();

        System.out.printf("Phone cost after reset: €%.2f%n", phone.getCost());
    }
}
