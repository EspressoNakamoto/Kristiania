/* 
    A class that implements Movable to mark the shapes point so we can keep track of it's position.
    We also use the override the methods from Movable to be able to move the points.
*/

public class MovablePoint implements Movable {

    // Keep track of the shapes
    private double x, y;

    // Add it to constructor to give it initial position
    public MovablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x axis
    public double getX() {
        return x;
    }

    // Getter for y axis
    public double getY() {
        return y;
    }

    // Override the methods from Movable
    @Override
    public void moveUp(double distance) {
        x -= distance;
    }

    @Override
    public void moveDown(double distance) {
        x += distance;
    }

    @Override
    public void moveLeft(double distance) {
        y -= distance;
    }

    @Override
    public void moveRight(double distance) {
        y += distance;
    }

    // toString method to output the position of the shape
    public String toString() {
        return "x is " + this.x + ", y is " + this.y;
    }
}