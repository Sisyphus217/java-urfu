package lr2.Example6;

public class Triangle implements Shape {
    private double BaseLine;
    private double SecondLine;
    private double ThirdLine;

    public Triangle(double baseLine, double secondLine, double thirdLine) {
        BaseLine = baseLine;
        SecondLine = secondLine;
        ThirdLine = thirdLine;
    }

    @Override
    public double calcArea() {
        double p = (BaseLine + SecondLine + ThirdLine) / 2;
        double height = (2 * Math.sqrt(p * (p - BaseLine) * (p - SecondLine) * (p - ThirdLine))) / BaseLine;
        return 0.5 * BaseLine * height;
    }

    @Override
    public double calcPerimeter() {
        return BaseLine + SecondLine + ThirdLine;
    }

    public double getBaseLine() {
        return BaseLine;
    }

    public void setBaseLine(double baseLine) {
        BaseLine = baseLine;
    }

    public double getSecondLine() {
        return SecondLine;
    }

    public void setSecondLine(double secondLine) {
        SecondLine = secondLine;
    }


}
