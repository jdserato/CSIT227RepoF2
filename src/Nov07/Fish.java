package Nov07;

public abstract class Fish extends Animal implements Swimmer, EggLaying {
    static int number_of_fishes = 0;

    public Fish(String name, int age) {
        super(name, age);
        number_of_fishes++;
    }

    static void print_no_of_fishes() {
        System.out.println("Number of fishes: " + number_of_fishes);
    }

    public void swim() {
        System.out.println("A fish is swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Fish " + name + " says Bloop Bloop");
    }

    @Override
    public int typeOfEggs() {
        return SOFT_EGG;
    }
}
