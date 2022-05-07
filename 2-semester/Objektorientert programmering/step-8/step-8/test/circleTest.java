import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.awt.Color;

import org.junit.Test;

public class circleTest {
    @Test
    public void createCircleEmptyConstructor() {
        Circle circle = new Circle(1);
        assertEquals(1.0, circle.getRadius(), 0);
        assertEquals(Math.PI * Math.pow(1.0, 2), circle.getArea(), 0);
        assertEquals(2 * Math.PI * 1, circle.getPerimiter(), 0);
        assertTrue(circle.getFill());
    }

    @Test
    public void createCircleRadiusConstructor() {
        Circle circle = new Circle(1, 3.0);
        assertEquals(3.0, circle.getRadius(), 0);
        assertEquals(Math.PI * Math.pow(3.0, 2), circle.getArea(), 0);
        assertEquals(2 * Math.PI * 3.0, circle.getPerimiter(), 0);
        assertTrue(circle.getFill());
    }

    @Test
    public void createCircleFullConstructor() {
        Circle circle = new Circle(1, 3.0);
        assertEquals(Color.red, circle.getColor());
        assertEquals(3.0, circle.getRadius(), 0);
        assertEquals(Math.PI * Math.pow(3.0, 2), circle.getArea(), 0);
        assertEquals(2 * Math.PI * 3.0, circle.getPerimiter(), 0);
        assertTrue(circle.getFill());
    }
}
