package packages.package1;

public class TowerApp {
    public static void main(String[] args) {
        Tower tower = new Tower();
        tower.setName("South Tower");
        tower.setLocation("Sint-Gillis, Brussels");
        tower.setCompleted(1967);
        tower.setHeightWithoutAntenna(150);
        tower.setFloors(37);
        tower.printDetails();
    }
}
