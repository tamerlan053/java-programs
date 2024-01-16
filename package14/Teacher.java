package packages.package14;

public class Teacher {
    private static final int MAX = 5;
    private String lastName;
    private String firstName;
    private int employmentPercentage;
    private Subject[] subjects = new Subject[MAX];

    public Leraar(String voornaam, String achternaam, int aansetlingspercentage) {
        this.voornaam = voornaam;
        this.naam = achternaam;
        setAansetlingspercentage(aansetlingspercentage);
    }

}
