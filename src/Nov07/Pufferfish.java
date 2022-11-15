package Nov07;

public class Pufferfish extends Fish {
    public Pufferfish(String name, int age) {
        super(name, age);
    }

    @Override
    public Animal layEggs() {
        return new Pufferfish("Puff", 0);
    }
}
