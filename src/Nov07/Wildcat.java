package Nov07;

public class Wildcat extends Cat {
    public Wildcat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void makeSound() {
        System.out.println("RAWR");
    }
}
