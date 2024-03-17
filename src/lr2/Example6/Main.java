package lr2.Example6;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Square square = new Square(4);
        Triangle triangle = new Triangle(42, 40, 26);
        System.out.printf("Площадь окружности: %f, периметр окружности: %f", circle.calcArea(), circle.calcPerimeter());
        System.out.printf("\nПлощадь квадрата: %f, периметр квадрата: %f", square.calcArea(), square.calcPerimeter());
        System.out.printf("\nПлощадь треугольника: %f, периметр треугольника: %f", triangle.calcArea(), triangle.calcPerimeter());

    }
}
