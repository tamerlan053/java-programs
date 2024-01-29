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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < MINIMUM_SALARY) {
            this.salary = MINIMUM_SALARY;
        } else {
            this.salary = salary;
        }
    }

    public static double getMinimumSalary() {
        return MINIMUM_SALARY;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Position: " + position);
        System.out.println("Salary: " + getSalary()); // question
    }

    public static int getCount() {
        return count;
    }
}
