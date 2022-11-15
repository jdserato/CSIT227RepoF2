package Nov07;

public abstract class Bird extends Animal implements EggLaying {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public int typeOfEggs() {
        return HARD_EGG;
    }
}
