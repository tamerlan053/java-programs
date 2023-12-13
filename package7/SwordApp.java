package packages.package7;

public class SwordApp {
    public static void main(String[] args) {

        Sword sword1 = new Sword();
        sword1.setMaterial("Wood");
        sword1.setDurability(33);

        Sword sword2 = new Sword();
        sword2.setMaterial("Stone");
        sword2.setDurability(500);

        Sword sword3 = new Sword();
        sword3.setMaterial("Diamond");
        sword3.setDurability(1500);

        Sword[] swords = {sword1, sword2, sword3};

        Sword mostDurableSword = swords[0];

        for (int i = 1; i < swords.length; i++) {
            if (swords[i].getDurability() > mostDurableSword.getDurability()) {
                mostDurableSword = swords[i];
            }
        }

        System.out.println("The most durable sword is made of " + mostDurableSword.getMaterial());

        System.out.printf("%10s %14s %n", "Material", "Durability");
        System.out.printf("%10s %14s %n", sword1.getMaterial(), sword1.getDurability());
        System.out.printf("%10s %14s %n", sword2.getMaterial(), sword2.getDurability());
        System.out.printf("%10s %14s %n", sword3.getMaterial(), sword3.getDurability());

    }
}
