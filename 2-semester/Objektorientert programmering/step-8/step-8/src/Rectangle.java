import java.awt.Color;

public class Rectangle extends Shape {
    private double width;
    private double length;

    public Rectangle(int id) {
        super(id);
        this.width = 1.0;
        this.length = 2.0;
        this.setColor(Color.green);
    }

    public Rectangle(int id, double width, double length) {
        super(id);
        this.width = width;
        this.length = length;
        setFill(true);
        setColor(Color.green);
    }

    public Rectangle(int id, double width, double length, Color color, boolean fill) {
        super(id);
        this.width = width;
        this.length = length;
        this.setColor(color);
        this.setFill(fill);
    }

    public double getWidth() {
        return width;
    }
    
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimiter() {
        return 2 * (this.width + this.length);
    }

    public String toString(){
        return "A Rectangle with width = "+ width + " and length = "+ length +", which is a subclass of " + super.toString();
    }
    
}
