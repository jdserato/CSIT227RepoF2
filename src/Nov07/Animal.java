package Nov07;

import java.util.Comparator;

public abstract class Animal implements Comparable<Animal> {
    protected String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return name + "(" +age + ")";
    }

    @Override
    public int compareTo(Animal o) {
        int res = this.name.compareTo(o.name);
        return -1 * res;
    }

    public static class AnimalAgeComparator implements Comparator<Animal> {

        @Override
        public int compare(Animal o1, Animal o2) {
            if (o1.age < o2.age) {
                return 1;
            }
            if (o1.age == o2.age) {
                return 0;
            }
            return -1;
        }
    }

    public static class AnimalNameComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            int res = o1.name.compareTo(o2.name);
            return -1 * res;
        }
    }
}
