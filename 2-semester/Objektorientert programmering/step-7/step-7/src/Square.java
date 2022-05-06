import java.awt.Color;

public class Square extends Rectangle {
    public Square() {
        this(1.0);
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, Color color, boolean fill) {
        super(side, side, color, fill);
    }

    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public String toString(){
        return "A Square with side = " + this.getSide() +", which is a subclass of " + super.toString();
    }
}
