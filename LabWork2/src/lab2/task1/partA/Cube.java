package lab2.task1.partA;

public class Cube extends Shape3D {
    private double a;

    public Cube(double length) {
        this.a = length;
    }

    @Override
    public double volume() {
        return Math.pow(a,3);
    }

    @Override
    public double surfaceArea() {
        return 6 * Math.pow(a, 2);
    }
}
