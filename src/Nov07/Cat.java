package Nov07;

public class Cat extends Animal {
    boolean gender_male;
    String color;
    String cat_breed;

    public Cat(String name, String color, int age) {
        super(name, age);
        this.color = color;
    }

    public void purr() {
        System.out.println(name + " purrs");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + name + " says Meow Meow");
    }
}
