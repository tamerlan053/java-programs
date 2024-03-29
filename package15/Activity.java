package packages.package15;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Activity {
    private LocalDate date;
    private String name;
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");

    public Activity(LocalDate date, String name) {
        this.date = date;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("%-15s %s", date.format(FORMATTER), name));
        return stringBuilder.toString();
    }
}
