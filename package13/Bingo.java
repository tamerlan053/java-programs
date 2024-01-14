package packages.package13;

import java.util.ArrayList;

public class Bingo {
    private String name;
    private ArrayList<Integer> numbers = new ArrayList<>();

    public Bingo(String name) {
        this.name = name;
    }

    public void addNumber(int number) {
        numbers.add(number);
    }

    public boolean hasNumber(int number) {
        return numbers.contains(number);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name).append(" ").append(numbers);
        return stringBuilder.toString();
    }
}
