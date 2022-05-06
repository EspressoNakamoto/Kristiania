import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void createCircleEmptyConstructor() {
        Circle circle = new Circle();
        assertTrue(circle.getFill());
        assertEquals(circle.getRadius(), 1.0, 0);
        assertEquals(Color.RED, circle.getColor());
    }

    @Test
    public void createCircleRadiusConstructor() {
        Circle circle = new Circle(2.0);
        assertTrue(circle.getFill());
        assertEquals(circle.getRadius(), 2.0, 0);
        assertEquals(Color.RED, circle.getColor());
    }
    @Test
    public void createCircleFullConstructor() {
        Circle circle = new Circle(2.0);
        assertTrue(circle.getFill());
        assertEquals(circle.getRadius(), 2.0, 0);
        assertEquals(Color.RED, circle.getColor());
    }


    @Test
    public void getPerimeter() {
        Circle circle = new Circle(2.0);
        assertEquals(4.0 * Math.PI, circle.getPerimiter(), 0);
    }

    @Test
    public void getArea() {
        Circle circle = new Circle(3.0);
        assertEquals(Math.PI * 3.0 * 3.0, circle.getAreal(), 0);
    }

}