package Another;
import Main.Human;

public class Main {
    public static void main(String[] args) {
        Human h = new Human();
//        h.setName("Joe Ed Secoya");   // THIS MUST NOT BE
        System.out.println(h.getName()); // THIS IS GOOD
    }
}
