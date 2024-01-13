package packages.package12;

public class Currency {
    private String name;
    private double exchangeRate;
    private static final int ROUNDING = 3;
    private static int count;

    public Currency() {
        this.name = "euro";
        this.exchangeRate = 1;
        count++;
    }
}
