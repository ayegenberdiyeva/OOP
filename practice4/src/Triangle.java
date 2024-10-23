public class Triangle extends Shape {
    int base, height;

    public Triangle(int pos, Color color, int base, int height) {
        super(pos, color);
        this.base = base;
        this.height = height;
    }

    public String draw(){
        return "Drawing Triangle at positon " + position + " with color " + color + ", with base " + base + ", height " + height + ".";
    }
}
