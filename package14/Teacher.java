package packages.package14;

public class Teacher {
    private static final int MAX = 5;
    private String lastName;
    private String firstName;
    private int employmentPercentage;
    private Subject[] subjects = new Subject[MAX];

    public Teacher(String firstName, String lastName, int employmentPercentage) {
        this.firstName = firstName;
        this.lastName = lastName;
        setEmploymentPercentage(employmentPercentage);
    }

    public void setEmploymentPercentage(int employmentPercentage) {
    if (employmentPercentage <= 100) {
        this.employmentPercentage = employmentPercentage;
        } else {
            this.employmentPercentage = 100;
        }
    }

    public void addSubjects(Subject subject) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] == null) {
                subjects[i] = subject;
                System.out.println("Subject " + subject.getName() + " has been added to the teacher.");
                return;
            }
        }
    }

    public void removeSubject(String subjectName) {
        for (int i = 0; i < subjects.length; i++) {
            if (subjects[i] != null && subjects[i].getName().equals(subjectName)) {
                subjects[i] = null;
                return;
            }
        }
    }
}
