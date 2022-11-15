package Nov07;

public class Whale extends Mammal implements Swimmer{
    public Whale(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println("Whale is swimming");
    }

    @Override
    public void makeSound() {

    }
}
