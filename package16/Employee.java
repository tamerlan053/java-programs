package packages.package16;

public class Employee extends Person {
    private String position;
    private double salary;
    private static final double MINIMUM_SALARY = 1000;
    private static int count;

    public Employee(String lastName, String firstName) {
        this(lastName, firstName, "general clerk", 1800);
    }

    public Employee(String lastName, String firstName, String position, double salary) {
        super(firstName, lastName);
        this.position = position;
        this.salary = salary;
        count++;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
