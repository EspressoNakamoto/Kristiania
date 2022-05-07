import java.awt.Color;

public abstract class Shape {
    private Color color;
    private boolean fill;
    private final int id;

    public abstract double getArea();
    public abstract double getPerimiter();

    public Shape(int id) {
        this.id = id;
        this.color = Color.red;
        this.fill = true;
    }

    public Shape(int id, Color color, boolean fill) {
        this.id = id;
        this.color = color;
        this.fill = fill;
    }

    public int getId() {
        return id;
    }

    public Color getColor() {
        return color;
    }
    
    public void setColor(Color color) {
        this.color = color;
    }

    public boolean getFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    public String toString(){
        if(this.getFill()) {
            return String.format("a Shape with color of %s and filled.", color.toString());
        }
        return String.format("a Shape with color of %s and not filled.", color.toString());
    }
}