package Another;
import Main.Human;
import Nov07.Animal;
import Nov07.Swimmer;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        // Wrapper Classes
        numbers.add(5);
        numbers.add(90);
        numbers.add(13);
        numbers.add(69);
        numbers.add(0);

        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();
        Collections.sort(numbers);
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
    }
}
