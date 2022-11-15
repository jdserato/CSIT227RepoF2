package Nov07;
import Main.Human;

public abstract class Cat extends Animal {
    boolean gender_male;
    String color;
    String cat_breed;
    Human owner;

    public Cat(String name, String color, int age) {
        super(name, age);
        this.color = color;
    }

//    abstract void meow();


    @Override
    public void makeSound() {
        System.out.println("MEOW");
    }

    public void purr() {
        System.out.println(name + " purrs");
    }
}
