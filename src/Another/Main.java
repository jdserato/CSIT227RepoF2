package Another;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean finished = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a: ");
                String a_str = sc.nextLine();
                int a = Integer.parseInt(a_str);
                System.out.print("Enter b: ");
                int b = sc.nextInt();
                ensurePositive(a);
                ensurePositive(b);
                int answer = a / b;
                System.out.println("Answer: " + answer);
                finished = true;
                throw new JayVinceException();
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("An error has occurred");

            }
        }while (false);
        System.out.println("PROCESS DONE");
    }

    static void ensurePositive(int n) {
        ensurePositive(n);
        if (n < 0) {
            throw new IllegalArgumentException(n + " is not positive");
        }
    }
}
