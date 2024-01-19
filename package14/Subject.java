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

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

     public void setCreditPoints(int creditPoints) {
        if (creditPoints <= 18)
            this.creditPoints = creditPoints;
        else
            this.creditPoints = 18;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public int getCreditPoints() {
        return creditPoints;
    }
}
