package packages.package5;

public class SpaceshipApp {
    public static void main(String[] args) {
        Spaceship spaceship1 = new Spaceship();
        spaceship1.setName("Spaceship-1");
        spaceship1.setHits(0);

        Spaceship spaceship2 = new Spaceship();
        spaceship2.setName("Spaceship-2");
        spaceship2.setHits(0);

        for (int i = 0; i < 2; i++) {
            spaceship1.fire(spaceship2);
            spaceship2.fire(spaceship1);
        }

        spaceship1.setShieldOn(true);

        for (int i = 0; i < 4; i++) {
            spaceship1.fire(spaceship2);
        }

        System.out.println(spaceship1.getHits() + " " + spaceship1.isDestroyed());
        System.out.println(spaceship2.getHits() + " " + spaceship2.isDestroyed());
    }
}
