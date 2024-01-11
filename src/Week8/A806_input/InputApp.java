package Week8.A806_input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputApp {
    public static void main(String[] args) {
        final int MIN_VALUE = 0;
        final int MAX_VALUE = 10;
        Scanner keyboard = new Scanner(System.in);
        boolean check = true;
        double number = 0.0;

        do {
            System.out.println("enter decimal number:");
            try {
                number = keyboard.nextFloat();
                if (number < MAX_VALUE && number > MIN_VALUE) {
                    check = false;
                    System.out.println("YOur number:" + number);
                    keyboard.next();
                } else {
                    System.out.printf("That number is not between %d and %d! \n", MIN_VALUE, MAX_VALUE);
                }
                keyboard.nextLine();

            } catch (InputMismatchException exc) {
                System.out.println(exc.getMessage());

                keyboard.next();

            }
        } while (check);
    }
}
