package packages.package4;

public class Hotel {
    private String hotelCode;
    private int starCount;
    private char childCode;

    public void setHotelCode(String hotelCode) {
        this.hotelCode = hotelCode;
    }

    public void setStarCount(int starCount) {
        this.starCount = starCount;
    }

    public void setChildCode(char childCode) {
        this.childCode = childCode;
    }

    public String getStars() {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < starCount; i++) {
            text.append("*");
        }
        return text.toString();
    }

    public double getPrice() {
        double price;
        if ("HI".equals(hotelCode)) {
            price = 70;
        } else {
            if (starCount == 4 || starCount == 5) {
                price = 60;
            } else if (starCount == 3) {
                if ("BR".equals(hotelCode) || "AN".equals(hotelCode)) {
                    price = 60;
                } else {
                    price = 56;
                }
            } else {
                price = 48;
            }
        }

        return price;
    }

    public double getChildPrice() {
        double childPrice = 0.0;
        if (childCode == 'A') {
            if (starCount == 1 || starCount == 2 || "HA".equals(hotelCode)) {
                childPrice = 0;
            } else {
                childPrice = getPrice() / 2;
            }
        } else {
            childPrice = getPrice() / 2;
        }
        return childPrice;
    }
}
