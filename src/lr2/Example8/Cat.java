package lr2.Example8;

public class Cat extends Animal {
    private String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка мурлычет");
    }

    @Override
    public void move() {
        System.out.println("Кошка бежит");
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
}
