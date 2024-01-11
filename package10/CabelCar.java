package packaga.ex3;

public class CableCar {
    private String name;
    private String country;
    private int valleyStationHeight;
    private int mountainStationHeight;
    private double length;
    private int speed; // m/s
    private int passengersPerCabin;

    private int numberOfCabins;
    private static final String[] VALID_COUNTRIES = {"France", "Austria", "Switzerland", "Italy"};

    public CableCar(String name, String country, double length, int speed) {
        setName(name);
        setCountry(country);
        this.length = length;
        setSpeed(speed);
    }

     public CableCar(String name, String country) {
        this(name, country, 2, 6);
    }

    public void setName(String name) {
        this.name = name;
    }
}
