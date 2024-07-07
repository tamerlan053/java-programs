package redactor;

public abstract class File implements Executable {
    private String name;
    private String content;
    private int fileSize;

    public File(String name) {
        this(name, 1024);
    }

    public File(String name, int fileSize) {
        this.name = name;
        this.fileSize = fileSize;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public int getFileSize() {
        return fileSize;
    }
}
