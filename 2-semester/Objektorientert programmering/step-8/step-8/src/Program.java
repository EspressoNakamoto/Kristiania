import java.awt.Color;
import java.util.HashMap;

public class Program {
    HashMap<Integer, Shape> shapes = new HashMap<Integer, Shape>();

    public void createCircle() {
        System.out.println("Creating circles...");

        Circle c1 = new Circle(1);
        System.out.printf("Circle with id=1: %s%n", c1);
        shapes.put(1, c1);

        Circle c2 = new Circle(2, 2.0);
        System.out.printf("Circle with id=2: %s%n", c2);
        shapes.put(2, c2);

        Circle c3 = new Circle(3, Color.blue, false, 5.0);
        System.out.printf("Circle with id=2: %s%n", c3);
        shapes.put(3, c3);

        System.out.println("Circles done.");
        System.out.println("------------");
    }

    public void createRectangle() {
        System.out.println("Creating rectangles...");

        Rectangle r1 = new Rectangle(4);
        System.out.printf("Rectangle with id=4: %s%n", r1);
        shapes.put(4, r1);

        Rectangle r2 = new Rectangle(5, 2.0, 3.0);
        System.out.printf("Rectangle with id=5: %s%n", r2);
        shapes.put(5, r2);

        Rectangle r3 = new Rectangle(6, 3.0, 5.0, Color.blue, false);
        System.out.printf("Rectangle with id=6: %s%n", r3);
        shapes.put(6, r3);

        System.out.println("Rectangles done.");
        System.out.println("------------");
    }

    public void createSquares() {
        System.out.println("Creating squares...");

        Square s1 = new Square(7);
        System.out.printf("Square with id=4: %s%n", s1);
        shapes.put(7, s1);

        Square s2 = new Square(8);
        System.out.printf("Square with id=4: %s%n", s2);
        shapes.put(8, s2);

        Square s3 = new Square(9);
        System.out.printf("Square with id=4: %s%n", s3);
        shapes.put(9, s3);

        System.out.println("Squares done.");
        System.out.println("------------");
    }

    public void listShapes() {
        System.out.println("---------------------");
        System.out.println("Showing all shapes...");
        System.out.println("---------------------");

        for (Shape iterable_element : shapes.values()) {
            System.out.print(iterable_element);
            System.out.println();
        }

        System.out.println("---------------------");
        System.out.println("All shapes printed");
        System.out.println("---------------------");
    }
}
