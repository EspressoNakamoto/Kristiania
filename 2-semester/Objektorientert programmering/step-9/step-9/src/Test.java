import java.awt.Color;
import java.util.ArrayList;

/**
 * Test is a class for testing purposes.
 * We test if the assignments work as intended.
 */
public class Test {
    /**
     * A dummy method to check if the program is working
     * initially after importing files from Canvas.
     */
    public void checkIfEverythingOk() {
        System.out.println("Yes, everything is on stell");
    }

    /*
     * Task 7
     * We create object of each shape, then add them to the arraylist.
     * Then move them and print out it's location to see that it moved.
     */
    public void moveShapes() {
        // Objects
        Circle circleObject = new Circle(1, Color.cyan, true, new MovablePoint(0, 0));

        Rectangle rectangleObject = new Rectangle(3.0, 5.0, Color.pink, true, new MovablePoint(0.0, 0.0),
                new MovablePoint(0.0, 0.0));

        Square squareObject = new Square(5, Color.green, true, new MovablePoint(0.0, 0.0), new MovablePoint(0.0, 0.0));

        // Arraylist to keep objects
        ArrayList<Shape> listShapes = new ArrayList<>();

        // Add our objects to the arraylist
        listShapes.add(circleObject);
        listShapes.add(rectangleObject);
        listShapes.add(squareObject);

        // Moveing shapes
        for (Shape shape : listShapes) {
            shape.moveDown(4.0);
            shape.moveRight(2.0);
        }

        // Print out shapes, it will initiate the toString methods in the classes
        for (Shape shape : listShapes) {
            System.out.println(shape);
        }
    }

    /*
     * Task 8
     * Java will upcast by default and automatically.
     * But if we want to use methods from the subclasses we need to downcast.
     */
    public void upCast() {
        // Create the objects
        Shape circleObject = new Circle(1, Color.blue, false, new MovablePoint(0.0, 0.0));

        Shape rectangleObject = new Rectangle(4.0, 6.0, Color.pink, true, new MovablePoint(0.0, 0.0),
                new MovablePoint(4.0, 6.0));

        Shape SquareObject = new Square(3.0, Color.red, true, new MovablePoint(0.0, 0.0), new MovablePoint(3.0, 3.0));

        // Create an array to keep the objects
        ArrayList<Shape> listShapes = new ArrayList<>();

        // Add objects to arraylist
        listShapes.add(circleObject);
        listShapes.add(rectangleObject);
        listShapes.add(SquareObject);

        // For loop to go through the objects and print out area, perimeter and their
        // unique methods within the subclasses
        for (Shape shape : listShapes) {
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());

            /*
             * If the object that the loop goes through is an instance of a subclass, we
             * downcast by telling Java to treat it like the subclass instead of the
             * superclass.
             * We do that by using "Type Name = (Type) nameOfLoop".
             * For example we have an object circleObject that's a Shape type, but we're
             * making a field telling it to treat the object from shape as a Circle type
             * instead of a Shape type (by stating it in the parenthesis).
             * Then we will have access to the unique methods in the subclasses.
             */
            if (shape instanceof Circle) { // If shape (from the loop) is an instance of Circle, run this code. ( new
                                           // Circle(); )
                Circle circle = (Circle) shape; // (Circle cirlce) is the field. ( (Circle) shape ) is where we tell
                                                // that shape(object from loop) will be treated as a Circle type instead
                                                // of a Shape type.
                circle.uniqueCircleMethod(); // Call the unique method from the Circle class.
            }

            // We do the same as obove to the rectangle object
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                rectangle.uniqueRectangleMethod();
            }

            // We do the same as above to the square object
            if (shape instanceof Square) {
                Square square = (Square) shape;
                square.uniqueSquareMethod();
            }
        }
    }
}
