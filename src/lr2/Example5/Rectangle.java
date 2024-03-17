package lr2.Example5;

public class Rectangle {
    private double Length;
    private double Width;

    public Rectangle(double length, double width) {
        Length = length;
        Width = width;
    }

    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculatePerimeter(double length, double width){
        return length + width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }
}
