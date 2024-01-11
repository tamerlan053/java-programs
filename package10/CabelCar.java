package packages.package10;

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

    public void setCountry(String country) {
        for (String validCountry : VALID_COUNTRIES) {
            if (validCountry.equals(country)) {
                this.country = country;
                return;
            }
        }

        this.country = "Unknown";
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setNumberOfCabins(int numberOfCabins) {
        this.numberOfCabins = numberOfCabins;
    }

    public int getNumberOfCabins() {
        return numberOfCabins;
    }

    public void setSpeed(int speed) {
        this.speed = speed;

        if (speed <= 3) {
            this.speed = 3;
        } else if (speed >= 8) {
            this.speed = 8;
        }
    }

    public void setPassengersPerCabin(int passengersPerCabin) {
        this.passengersPerCabin = passengersPerCabin;
    }

    public void setHeights(int height1, int height2) {
        this.mountainStationHeight = Math.max(height1, height2);
        this.valleyStationHeight = Math.min(height1, height2);
    }

    public int getHeightDifference() {
        return mountainStationHeight - valleyStationHeight;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getValleyStationHeight() {
        return valleyStationHeight;
    }

    public int getMountainStationHeight() {
        return mountainStationHeight;
    }

    public double getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPassengersPerCabin() {
        return passengersPerCabin;
    }

    public int getDuration() {
        int duration = (int) ((length * 1000) / getSpeed()) / 60;
        return duration;
    }

    public int getTransportCapacity() {
        return (60 * numberOfCabins * passengersPerCabin) / getDuration();
    }

    public String toString() {
        return String.format(name + " " + getHeightDifference());
    }
}

