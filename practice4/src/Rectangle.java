public class Rectangle extends Shape {
    int width, height;

    public Rectangle(int pos, Color color, int width, int height) {
        super(pos, color);
        this.width = width;
        this.height = height;
    }

    public String draw() {
        return "Drawing Rectangle at positon " + position + " with color " + color + ", width " + width + ", height " + height + ".";
    }
}
