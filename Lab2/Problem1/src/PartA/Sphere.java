package PartA;

public class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return 1.33 * Math.PI * radius * radius * radius;
    }

    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }
}
