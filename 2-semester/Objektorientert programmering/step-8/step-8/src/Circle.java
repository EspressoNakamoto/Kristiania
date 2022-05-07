import java.awt.Color;

public class Circle extends Shape {
    private double radius;

    // Empty constructor
    public Circle(int id) {
        super(id);
        radius = 1.0;
    }

    // Radius constructor
    public Circle(int id, double radius) {
        super(id);
        this.radius = radius;
    }

    // Full constructor
    public Circle(int id, Color color, boolean fill, double radius) {
        super(id, color, fill);
        this.radius = radius;
    }

    public String toString() {
        return String.format("A Circle with radius = %s, which is a subclass of %s", radius, super.toString());
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimiter() {
        return 2 * Math.PI * this.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
