package lr2.Example8;

public abstract class Animal implements SoundMaker, Movable {
    private String name;
    private int age;

    // Конструктор
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры и сеттеры для полей name и age
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
