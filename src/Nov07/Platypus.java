package Nov07;

public class Platypus extends Mammal implements EggLaying{
    public Platypus(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Platypus " + name + ": KKKKKkkkkkKK");
    }

    @Override
    public Animal layEggs() {
        return new Platypus("Perry", 0);
    }

    @Override
    public int typeOfEggs() {
        return HARD_EGG;
    }
}
