package shapes;

import shapes.Shape;

public class Rectangle implements Shape {
    private int heigth, base;

    public Rectangle(int heigth, int base) {
        this.heigth = heigth;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "heigth=" + heigth +
                ", base=" + base +
                ", area=" + calculateArea() +
                '}';
    }

    @Override
    public int calculateArea() {
        return base * heigth;
    }

}
