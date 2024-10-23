import java.awt.*;

abstract class Shape {
    enum Color{
        WHITE, BLACK, RED, GREEN, BLUE
    }

    int position;
    Color color;

    public Shape(int position, Color color) {
        this.position = position;
        this.color = color;
    }

    public abstract String draw();
}
