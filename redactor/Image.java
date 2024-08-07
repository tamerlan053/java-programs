package redactor;

import java.util.Random;

public class Image extends File {
    private int[] dimensies;

    public Image(String name, int[] dimensions) {
        super(name, 3 * dimensions[0] * dimensions[1]);
        this.dimensions = dimensions;
        setContent("-=*");
    }

    @Override
    public void execute() {
        System.out.println(getName());

        Random random = new Random();

        for (int i = 0; i < dimensions[0]; i++) {
            for (int j = 0; j < dimensions[1]; j++) {
                char randomChar = getContent().charAt(random.nextInt(getContent().length()));
                System.out.print(randomChar);
            }
            System.out.println();
        }
    }
}
