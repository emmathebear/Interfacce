import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,3);
        System.out.println(triangle);
        Rectangle rectangle = new Rectangle(3,2);
        System.out.println(rectangle);
        Shape shape = new Triangle(10,10) ;
        System.out.println(shape);
    }
}