package PartA;

public class Cube extends Shape3D {
    private double side_length;

    public Cube(double side_length){
        this.side_length = side_length;
    }

    public double volume(){
        return side_length*side_length*side_length;
    }

    public double surfaceArea(){
        return 6*side_length*side_length;
    }
}
