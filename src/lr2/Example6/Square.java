package lr2.Example6;

public class Square implements Shape {
    private double BaseLength;

    public Square(double baseLength) {
        BaseLength = baseLength;
    }

    @Override
    public double calcArea() {
        return BaseLength * BaseLength;
    }

    @Override
    public double calcPerimeter() {
        return BaseLength * 4;
    }

    public double getBaseLength() {
        return BaseLength;
    }

    public void setBaseLength(double baseLength) {
        BaseLength = baseLength;
    }

}
