package packages.package5;

public class Spaceship {
    private String name;
    private int hits;
    private boolean shieldOn;

    public void setName(String name) {
        this.name = name;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public void setShieldOn(boolean shieldOn) {
        this.shieldOn = shieldOn;
        if (shieldOn) {
            System.out.println(name + " puts shield on");
        } else {
            System.out.println(name + " puts shield off");
        }
    }

    public String getName() {
        return name;
    }

    public int getHits() {
        return hits;
    }

    public boolean isShieldOn() {
        return shieldOn;
    }

    public void fire(Spaceship secondSpaceship) {
        System.out.println(name + " fires at " + secondSpaceship.getName());

        if (!secondSpaceship.isShieldOn()) {
            System.out.println(secondSpaceship.getName() + " is damaged!");
            secondSpaceship.hits += 1;
        } else {
            System.out.println(secondSpaceship.getName() + " spaceship that fired is hit");
            hits += 1;
        }
    }

    public boolean isDestroyed() {
        return hits >= 5;
    }
}
