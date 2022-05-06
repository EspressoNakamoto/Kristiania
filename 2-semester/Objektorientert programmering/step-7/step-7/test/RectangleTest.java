import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void createRectangleEmptyConstructor() {
        Rectangle rectangle = new Rectangle();
        assertTrue(rectangle.getFill());
        assertEquals(rectangle.getLength(), 2.0, 0);
        assertEquals(rectangle.getWidth(), 1.0, 0);
        assertEquals(Color.GREEN, rectangle.getColor());
    }

    @Test
    public void createRectangleWidthAndLengthConstructor() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        assertTrue(rectangle.getFill());
        assertEquals(rectangle.getLength(), 4.0, 0);
        assertEquals(rectangle.getWidth(), 3.0, 0);
        assertEquals(Color.GREEN, rectangle.getColor());
    }
    @Test
    public void createRectangleFullConstructor() {
        Rectangle rectangle = new Rectangle(4.0, 5.0, Color.BLUE, false);
        assertFalse(rectangle.getFill());
        assertEquals(rectangle.getLength(), 5.0, 0);
        assertEquals(rectangle.getWidth(), 4.0, 0);
        assertEquals(Color.BLUE, rectangle.getColor());
    }

    @Test
    public void getArea() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        assertEquals(rectangle.getArea(), 12.0, 0);
    }

    @Test
    public void getPerimeter() {
        Rectangle rectangle = new Rectangle(3.0, 4.0);
        assertEquals(rectangle.getPerimiter(), 14.0, 0);
    }
}