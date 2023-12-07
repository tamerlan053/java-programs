package packages.package2;

public class SwimmingPool {
    private double length;
    private double width;
    private double depth;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public int getVolume() {
        return (int) (length * width * depth * 1000);
    }

    public int getWaterVolume() {
        return (int) (getVolume() * 0.98);
    }

    public int getDisinfectantVolume() {
        return (int) (getVolume() * 0.02);
    }
}

