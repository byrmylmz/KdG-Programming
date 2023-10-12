package Week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_02_10_Switches {

    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);
        int number;

        boolean sw_1 = true;
        boolean sw_2 = true;
        boolean sw_3 = true;

        try {
            System.out.println("Enter the state of switch 1 (true or false):");
            sw_1 = keyboard.nextBoolean();
            System.out.println("Enter the state of switch 2 (true or false):");
            sw_2 = keyboard.nextBoolean();
            System.out.println("Enter the state of switch 3 (true or false):");
            sw_3 = keyboard.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("invalid true or false");
        }
        if (sw_1 && (sw_2 || sw_3) || (sw_2 && sw_3)) {
            System.out.println("At least two switches are turned on.");
        }

        if ((sw_1 && sw_2 && !sw_3) || (sw_1 && !sw_2 && sw_3) || (!sw_1 && sw_2 && sw_3)) {
            System.out.println("Exactly two switches are turned on.");
        }

        if ((!sw_1 && !sw_2) || (!sw_1 && sw_2) || (sw_1 && !sw_2)) {
            System.out.println("At most one switch is turned on.");
        }
        keyboard.close();

    }
}
