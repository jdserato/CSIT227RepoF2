package Nov07;

public class Dog extends Animal {
    boolean gender_male;
    String color;
    String dog_breed;

    public Dog(String name, String color, int age) {
        super(name, age);
        this.color = color;
    }

    public void bark() {
        System.out.println(name + " says Arf Arf");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + super.name + " says Aw Aw");
    }


}
