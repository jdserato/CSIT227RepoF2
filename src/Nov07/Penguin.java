package Nov07;

public class Penguin extends Bird implements Swimmer{
    public Penguin(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println("A penguin is swimming");
    }

    @Override
    public void makeSound() {
        System.out.println("Penguin " + name + ": Floo floo");
    }

    @Override
    public Animal layEggs() {
        return new Penguin("Hermi", 0);
    }


}
