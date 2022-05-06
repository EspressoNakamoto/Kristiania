import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void createSquareEmptyConstructor() {
        Square square = new Square();
        assertTrue(square.getFill());
        assertEquals(square.getLength(), 1.0, 0);
        assertEquals(square.getWidth(), 1.0, 0);
        assertEquals(Color.GREEN, square.getColor());
    }

    @Test
    public void createSquareWidthSideConstructor() {
        Square square = new Square(5.0);
        assertTrue(square.getFill());
        assertEquals(square.getLength(), 5.0, 0);
        assertEquals(square.getWidth(), 5.0, 0);
        assertEquals(Color.GREEN, square.getColor());
    }
    @Test
    public void createSquareFullConstructor() {
        Square square = new Square(7.0, Color.DARK_GRAY, false);
        assertFalse(square.getFill());
        assertEquals(square.getLength(), 7.0, 0);
        assertEquals(square.getWidth(), 7.0, 0);
        assertEquals(Color.DARK_GRAY, square.getColor());
    }

    @Test
    public void getArea() {
        Square square = new Square(5.0);
        assertEquals(square.getArea(), 25.0, 0);
    }

    @Test
    public void getPerimeter() {
        Square square = new Square(5.0);
        assertEquals(square.getPerimiter(), 20.0, 0);
    }

}