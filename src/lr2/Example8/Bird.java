package lr2.Example8;

public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Птица поет");
    }

    @Override
    public void move() {
        if (canFly) {
            System.out.println("Птица летит");
        } else {
            System.out.println("Птица ходит");
        }
    }

    public boolean canFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }
}
