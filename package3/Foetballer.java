package packages.package3;

public class Footballer {
    public String name;
    private int age;
    private int rating;
    private String playerType;
    private int goals;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public double getPrice() {
        double basePrice = 0.0;

        if ("Forward".equals(playerType)) {
            basePrice = 30000.0;
        } else if ("Midfielder".equals(playerType)) {
            basePrice = 28000.0;
        } else if ("Defender".equals(playerType)) {
            basePrice = 29000.0;
        } else if ("Goalkeeper".equals(playerType)) {
            basePrice = 25000.0;
        }

        if (age < 25) {
            basePrice *= 1.10;
        } else if (age > 30) {
            basePrice *= 0.95;
        }

        if ("Forward".equals(playerType)) {
            if (goals <= 5) {
                basePrice = basePrice + 10000 * goals;
            } else {
                basePrice = basePrice + 10000 * 5 + 20000 * (goals - 5);
            }
        } else {
            basePrice += 10000 * rating;
            if ("Goalkeeper".equals(playerType)) {
                if (goals >= 20) {
                    basePrice = basePrice - 9000;
                }
            }
        }

        return basePrice;
    }
}
