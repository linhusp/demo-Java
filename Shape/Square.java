/**
 * Square extends Rectangle
 */
public class Square extends Rectangle {

    private double side;

    public Square() {
        super();
        this.side= 0;
    }

    public Square(double side) {
        super();
        this.side= side;
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side= side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side= side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double length) {
        super.setLength(side);
    }

    public String toString() {
        return "Square["+super.toString()+"]";
    }
}
