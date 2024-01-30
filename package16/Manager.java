package packages.package16;

public class Manager extends Employee {
    private double bonus;
    private static int count;

    public Manager(String lastName, String firstName, String position, double salary) {
        this(lastName, firstName, position, salary, 50);
    }
}
