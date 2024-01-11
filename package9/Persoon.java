package packages.package9;

public class Persoon {
    private String firstName;
    private String lastName;
    private double height;
    private double weight;
    private int birthYear;
    private static final double MAX_HEIGHT = 2.4;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person() {
        this("unknown", "unknown");
    }

    public Person(Person existingPerson) {
        this.firstName = existingPerson.firstName;
        this.lastName = existingPerson.lastName;
        this.height = existingPerson.height;
        this.weight = existingPerson.weight;
        this.birthYear = existingPerson.birthYear;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setHeight(double height) {
        if (height > MAX_HEIGHT) {
            height = MAX_HEIGHT;
        }
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String toString() {
        return "This person is " + firstName + " " + lastName + "\n"
                + "weight         : " + String.format("%.2f", weight) + "\n"
                + "height         : " + String.format("%.2f", height) + "\n"
                + "birth year     : " + birthYear;
    }

    public double calculateBmi() {
        return weight / (height * height);
    }

    public String getDescription() {
        double bmi = calculateBmi();
        String description;
        if (bmi < 18) {
            description = "underweight";
        } else if (bmi < 25) {
            description = "normal";
        } else if (bmi < 30) {
            description = "overweight";
        } else if (bmi < 40) {
            description = "obese";
        } else {
            description = "morbidly obese";
        }
        return description;
    }

    public void addFirstNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            this.firstName += " " + names[i];
        }
    }

       public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge() {
        return 2023 - birthYear;
    }

    public void grow() {
        height += 1;
    }

    public void grow(int amount) {
        height += amount;
    }
}
