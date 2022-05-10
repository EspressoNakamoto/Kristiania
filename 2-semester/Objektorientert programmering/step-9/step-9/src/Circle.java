import java.awt.*;

public class Circle extends Shape {

    private double radius;
    private MovablePoint center; // Add center field to keep track of the center of the the circle.

    /*
     * Let's have only one constructor. We require that all fields are populated
     * through constructor.
     * We now have no alternative options when creating a circle object.
     */

    // Add center as a parameter to the constructor to give it a position when we
    // create an object.
    public Circle(int radius, Color color, boolean filled, MovablePoint center) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    // Getter for center field
    public MovablePoint getCenter() {
        return center;
    }

    // Setter for center field
    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Override the move methods that we extend from Shape to be able to move Circle
    // objects
    @Override
    public void moveUp(double distance) {
        center.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        center.moveDown(distance);
    }

    @Override
    public void moveRight(double distance) {
        center.moveRight(distance);
    }

    @Override
    public void moveLeft(double distance) {
        center.moveLeft(distance);
    }

    /*
     * We override the abstract method getArea in Shape.
     * If we do not do this, this class (Circle) must be abstract as we are missing
     * implementation details for an abstract method defined in class Shape.
     */
    @Override
    public double getArea() {
        return (radius * radius) * Math.PI;
    }

    /*
     * We override the abstract method getPerimeter in Shape.
     * If we do not do this, this class (Circle) must be abstract as we are missing
     * implementation details for an abstract method defined in class Shape.
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /*
     * We override a method from the Object class.
     * Remember that all classes inherit from the Object class.
     * It is normal to override this method as the method
     * inherited from Object provides little information.
     */
    @Override
    public String toString() {
        // Using the String class static method "format" as an alternative string
        // concatenation.
        return String.format("A Circle with radius = %s, which is a subclass of %s",
                radius, super.toString()); // Look! I can call my parent version of toString:)
    }

    // Unique method for task 8
    public void uniqueCircleMethod() {
        System.out.println("This is the unique method for Circle.");
    }
}