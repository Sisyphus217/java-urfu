package lr2.Example6;

public class Circle implements Shape {
    private final double PI = 3.14;
    private double Radius;

    public Circle(double radius) {
        Radius = radius;
    }

    @Override
    public double calcArea() {
        return PI * Radius * Radius;
    }

    @Override
    public double calcPerimeter() {
        return 2 * PI * Radius;
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }


}
