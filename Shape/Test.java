/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        Shape newShape= new Shape("blue", true);
        System.out.println(newShape.toString());
        System.out.println();

        Circle newCircle= new Circle(3, newShape.getColor(), newShape.isFilled());
        System.out.println(newCircle.toString());
        System.out.println();

        Rectangle newRec= new Rectangle(2, 3, newShape.getColor(), newShape.isFilled());
        System.out.println(newRec.toString());
        System.out.println();

        Square newSquare= new Square(2, newShape.getColor(), newShape.isFilled());
        System.out.println(newSquare.toString());
        System.out.println();
    }
}
