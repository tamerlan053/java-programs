package redactor;

public abstract class File implements Executable {
    private String name;
    private String content;
    private int fileSize;

    public File(String name) {
        this(name, 1024);
    }
}
