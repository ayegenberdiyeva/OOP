public class Circle extends Shape {
    int radius;

    public Circle(int pos, Color color, int radius) {
        super(pos, color);
        this.radius = radius;
    }

    public String draw(){
        return "Drawing Circle at position " + position + " with radius " + radius + " and color " + color + ".";
    };
}
