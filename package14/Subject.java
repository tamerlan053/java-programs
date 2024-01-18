package packages.package14;

public class Subject {
    private String code;
    private String name;
    private int creditPoints;

    public Subject(String name, String code, int creditPoints) {
        this.name = name;
        this.code = code;
        setCreditPoints(creditPoints);
    }
}
