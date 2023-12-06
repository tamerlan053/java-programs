package packages.package1;

public class Tower {
    private String name;
    private String location;
    private int completed;
    private int heightWithoutAntenna;
    private int floors;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    public void setHeightWithoutAntenna(int heightWithoutAntenna) {
        this.heightWithoutAntenna = heightWithoutAntenna;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getCompleted() {
        return completed;
    }

    public int getHeightWithoutAntenna() {
        return heightWithoutAntenna;
    }

    public int getFloors() {
        return floors;
    }

    public void printDetails() {
        System.out.println("The name is: " + name);
        System.out.println("The location is: " + location);
        System.out.println("The completed status is: " + completed);
        System.out.println("The height without antenna is: " + heightWithoutAntenna);
        System.out.println("The number of floors is: " + floors);
    }
}
