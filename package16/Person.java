package packages.package16;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;    
    }

    public void print() {
        System.out.println(firstName + " " + lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
