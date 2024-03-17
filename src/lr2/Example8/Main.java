package lr2.Example8;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("bobik", 2, "овчарка");
        Cat cat = new Cat("musya", 3, "вискес");
        Bird bird = new Bird("petushara", 1, false);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
