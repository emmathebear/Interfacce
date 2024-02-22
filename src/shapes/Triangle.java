package shapes;

import shapes.Shape;

public class Triangle implements Shape {
    private int heigth, base;

    public Triangle(int heigth, int base) {
        this.heigth = heigth;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "heigth=" + heigth +
                ", base=" + base +
                ", area=" + calculateArea() +
                '}';
    }

    @Override
    public int calculateArea() {
        return base * heigth / 2;
    }

}
