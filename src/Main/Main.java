package Main;

public class Main {
    public static void main(String[] args) {
        System.out.println(Human.SPECIES);
        System.out.println(Human.AGE_OF_DEATH);

        Human h = new Human();
        System.out.println(h.SPECIES);
        System.out.println(Human.human_count);
        Human h1 = new Human( 23,"Jay Vince Serato", true);
        System.out.println();

        System.out.println(Human.human_count); // ?
        Human h2 = h;
//        h2.setName("Marie Curie");
        System.out.println(h2.getName());
        System.out.println(h.getName());
//        h.setName("John Christian Idul");
        System.out.println(h2.getName());
        System.out.println(h.getName());
        System.out.println(Human.human_count); // ?

        Rectangle r = new Rectangle();
        r.x1 = 5;
        r.x2 = 10;
        System.out.println(r.x1 + " and " + r.x2);
    }
}