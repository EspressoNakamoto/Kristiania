import java.awt.Color;

public class Shape {
    private Color color;
    private boolean fill;

    public Shape() {
        this.color = Color.red;
        this.fill = true;
    }

    public Shape(Color color, boolean fill) {
        this.color = color;
        this.fill = fill;
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