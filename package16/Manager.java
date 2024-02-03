package packages.package16;

public class Manager extends Employee {
    private double bonus;
    private static int count;

    public Manager(String lastName, String firstName, String position, double salary) {
        this(lastName, firstName, position, salary, 50);
    }

    public Manager(String lastName, String firstName, String position, double salary, double bonus) {
        super(lastName, firstName, position, salary);
        this.bonus = bonus;
        count++;
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    public static int getCount() {
        return count;
    }

    public double getPremie() {
        return bonus * 0.5;
    }
}
