package redactor;

import java.util.Random;

public class Image extends File {
    private int[] dimensies;

    public Image(String name, int[] dimensions) {
        super(name, 3 * dimensions[0] * dimensions[1]);
        this.dimensions = dimensions;
        setContent("-=*");
    }
}
