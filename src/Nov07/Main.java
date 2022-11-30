package Nov07;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static final int SAMPLE = 5;

    public static void main(String[] args) {
        Dog browny = new Dog("Browny", "White", 3);
//        System.out.println(browny.age);
        System.out.println(browny.color);
        browny.bark();
        browny.bark("Jay Vince");
        browny.makeSound();
        browny.eat();
        System.out.println(browny);

        Cat nyeko = new Wildcat("Nyako", "Orange", 2);
        System.out.println(nyeko.color);
        Cat tigre = new Tiger("Tigre", "Orange", 5);
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(nyeko);
        cats.add(tigre);
        for (Cat c : cats) {
            c.makeSound();
        }
        nyeko.eat();
        nyeko.purr();
        Animal ani = new Dog("Meowy", "Brown", 5);
//        Cat meowy = (Cat) ani;
//        meowy.purr();

        Fish nemo = new Pufferfish("Nemo", 1);
        Animal a_nemo = nemo;

        Wildcat cit = new Wildcat("Cit", "Maroon&Gold", 50);
        cit.makeSound();
        Bird pangi = new Penguin("Pangi", 5);
        Animal joeed = new Whale("Joe Ed", 20);
        Fish lance = new Pufferfish("Lance", 20);
        Platypus plat = new Platypus("Plat", 9);
        lance.print_no_of_fishes();
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(lance);
        animals.add(browny);
        animals.add(joeed);
        animals.add(nyeko);
        animals.add(ani);
        animals.add(pangi);
        animals.add(nemo);
        animals.add(plat);
        Collections.sort(animals, new Animal.AnimalNameComparator()); // uses Comparator
        System.out.println("SORT BY NAME");
        for (Animal a : animals) {
            System.out.println(a);
//            a.makeSound();
//            if (a instanceof Dog) {
//                Dog dog = (Dog) a;
//                dog.bark();
//                // the same as
////                ((Dog) a).bark();
//            }
//            if (a instanceof Swimmer) {
////                Swimmer f = (Swimmer) a;
////                f.swim();
//                Swimmer.dive();
//            }
//            if (a instanceof EggLaying) {
//                EggLaying e = (EggLaying) a;
//                Animal n_ani = e.layEggs();
//                n_ani.makeSound();
//                System.out.println(e + "'s child is " + n_ani);
//            }
        }
        // uses Comparator
        Collections.sort(animals, new Animal.AnimalAgeComparator());
        System.out.println("USES COMPARATOR");
        for (Animal a : animals) {
            System.out.println(a);
        }
    }
}
