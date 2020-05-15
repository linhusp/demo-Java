/**
 * Circle extends Shape
 */
public class Circle extends Shape {

    private double radius;

    public Circle() {
        super();
        this.radius= 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius= radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius= radius;
    }

    public double getArea() {
        double area= Math.PI*Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter() {
        double perimeter= 2*Math.PI*radius;
        return perimeter;
    }

    public String toString() {
        return "Circle["+super.toString()+", radius= "+radius+", area= "+this.getArea()+", perimeter= "+this.getPerimeter()+"]";
    }

    public String temp() {
        return "It's just a test!";
    }
}
