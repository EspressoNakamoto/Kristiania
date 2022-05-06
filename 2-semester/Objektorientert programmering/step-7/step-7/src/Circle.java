import java.awt.Color;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Color color, boolean fill, double radius) {
        super(color, fill);
        this.radius = radius;
    }

    public String toString() {
        return String.format("A Circle with radius = %s, which is a subclass of %s", radius, super.toString());
    }

    public double getAreal() {
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
