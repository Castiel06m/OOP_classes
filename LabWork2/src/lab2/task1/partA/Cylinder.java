package lab2.task1.partA;

public class Cylinder extends Shape3D {

    private double radius, height;

    public Cylinder(double r, double h) {
        this.radius = r;
        this.height = h;
    }


    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (Math.PI * radius * height + Math.PI * Math.pow(radius, 2));
    }


}
