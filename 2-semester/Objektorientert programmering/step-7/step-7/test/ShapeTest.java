import org.junit.Test;
import java.awt.*;
import static org.junit.Assert.*;

public class ShapeTest {
    @Test
    public void createShapeEmptyConstructor() {
        Shape shape = new Shape();
        assertTrue(shape.getFill());
        assertEquals(Color.RED, shape.getColor());
    }

    @Test
    public void createShapeFullConstructor() {
        Shape shape = new Shape(Color.CYAN, false);
        assertFalse(shape.getFill());
        assertEquals(Color.CYAN, shape.getColor());
    }
}