import java.awt.*;

public class Rectangle extends Shape {

    private double width;
    private double length;

    // To keep track of the position of the rectangle we need to points instead of
    // one that we use on Circle
    private MovablePoint topLeft, bottomRight;

    /*
     * Let's have only one constructor. We require that all fields are populated
     * through constructor.
     * We now have no alternative options when creating a rectangle object.
     */

    // Add points to constructor to give it initial position
    Rectangle(double width, double length, Color color, boolean filled, MovablePoint topLeft,
            MovablePoint bottomRight) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getter for top left point
    public MovablePoint getTopLeft() {
        return topLeft;
    }

    // Setter for top left point
    public void setTopLeft(MovablePoint topLeft) {
        this.topLeft = topLeft;
    }

    // Getter for bottom right point
    public MovablePoint getBottomRight() {
        return bottomRight;
    }

    // Setter for bottom right point
    public void setBottomRight(MovablePoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Override the move methods that we extend from Shape
    @Override
    public void moveUp(double distance) {
        topLeft.moveUp(distance);
        bottomRight.moveUp(distance);
    }

    @Override
    public void moveDown(double distance) {
        topLeft.moveDown(distance);
        bottomRight.moveDown(distance);
    }

    @Override
    public void moveRight(double distance) {
        topLeft.moveRight(distance);
        bottomRight.moveRight(distance);
    }

    @Override
    public void moveLeft(double distance) {
        topLeft.moveLeft(distance);
        bottomRight.moveLeft(distance);
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    /*
     * We override the abstract method getArea in Shape.
     * If we do not do this, this class (Rectangle) must be abstract as we are
     * missing
     * implementation details for an abstract method defined in class Shape.
     */
    public double getArea() {
        return length * width;
    }

    /*
     * We override the abstract method getPerimeter in Shape.
     * If we do not do this, this class (Rectangle) must be abstract as we are
     * missing
     * implementation details for an abstract method defined in class Shape.
     */
    public double getPerimeter() {
        return 2 * (length + width);
    }

    /*
     * We override a method from the Object class.
     * Remember that all classes inherit from the Object class.
     * It is normal to override this method as the method
     * inherited from Object provides little information.
     */
    public String toString() {
        return "A Rectangle with width = " + width + " and length = " +
                length + ", topLeft: " + topLeft + ", bottomRight: " +
                bottomRight + " which is a subclass of " + super.toString();
    }

    // Unique method for task 8
    public void uniqueRectangleMethod() {
        System.out.println("This is the unique method for Rectangle.");
    }

}