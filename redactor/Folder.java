package redactor;

import java.util.ArrayList;

public class Folder implements Executable {
    private String name;
    private ArrayList<File> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void addFiles(File[] array) {
        for (int i = 0; i < array.length; i++) {
            files.add(array[i]);
        }
    }

    @Override
    public void execute() {
        System.out.println(name);

        for (int i = 0; i < files.size(); i++) {
            System.out.println(files.get(i).toString());
        }
    }
}
