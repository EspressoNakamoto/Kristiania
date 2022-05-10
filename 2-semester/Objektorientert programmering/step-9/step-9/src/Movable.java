/* 
    Interface that we use to move our shapes.
    This is similar to abstraction but we do not wish to create an object with this.
*/

public interface Movable {
    void moveUp(double distance);

    void moveDown(double distance);

    void moveRight(double distance);

    void moveLeft(double distance);
}
