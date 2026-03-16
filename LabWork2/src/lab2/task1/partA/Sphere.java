package lab2.task1.partA;

public class Sphere extends Shape3D {
    private double radius;
    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return  4 * Math.PI * Math.pow(radius, 2);
    }
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 3) * (4.0/3.0);
    }
}
