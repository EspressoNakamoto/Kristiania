import java.awt.Color;

public class Square extends Rectangle {
    public Square(int id) {
        super(id, 1.0, 1.0);
    }

    public Square(int id, double side) {
        super(id, side, side);
    }

    public Square(int id, double side, Color color, boolean fill) {
        super(id, side, side, color, fill);
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
