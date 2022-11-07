package Nov07;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog browny = new Dog("Browny", "White", 3);
        System.out.println(browny.age);
        System.out.println(browny.color);
        browny.bark();
        browny.makeSound();
        browny.eat();
        System.out.println(browny);

        Cat nyeko = new Cat("Nyeko", "Orange", 2);
        System.out.println(nyeko.color);
        nyeko.eat();
        nyeko.purr();
        Animal ani = new Cat("Meowy", "Brown", 5);

        Fish nemo = new Fish("Nemo", 1);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(browny);
        animals.add(nyeko);
        animals.add(ani);
        animals.add(nemo);

        for (Animal a : animals) {
            a.makeSound();
        }
    }
}
