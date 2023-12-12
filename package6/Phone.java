package packages.package6;

public class Phone {
    private String number;
    private String provider;
    private int numberOfCalls;
    private int numberOfFreeCalls;

    public void setNumber(String number) {
        this.number = number;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setNumberOfCalls(int numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }

    public void setNumberOfFreeCalls(int numberOfFreeCalls) {
        this.numberOfFreeCalls = numberOfFreeCalls;
    }

    public String getNumber() {
        return number;
    }

    public String getProvider() {
        return provider;
    }

    public int getNumberOfCalls() {
        return numberOfCalls;
    }

    public int getNumberOfFreeCalls() {
        return numberOfFreeCalls;
    }

    public boolean isAFreeCall() {
        return number.equals("112") || number.equals("102") || number.equals("0702245245");
    }

    public void call(String phoneNumber) {
        number = phoneNumber;
        if (isAFreeCall()) {
            numberOfFreeCalls++;
        } else {
            numberOfCalls++;
        }
    }

    public double getCost() {
        double cost;
        if (provider.equals("Floximus")) {
            cost = 0.25;
            if (numberOfCalls > 20) {
                cost *= 0.95;
            }
        } else {
            cost = 0.21;
        }

        return numberOfCalls * cost;
    }

    public void reset() {
        numberOfCalls = 0;
        numberOfFreeCalls = 0;
    }
}
