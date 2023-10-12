package Week2;

import java.util.Scanner;

public class Ex_02_04_Number_V2 {

    public static void main(String[] arg) {
        final int MINIMUM = 100_000;
        final int MAXIMUM = 999_999;

        long numberA;
        long numberB;
        long product;
        int lastFiveDigits;

        //Scanner
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a 6-digit whole number:");
        numberA = keyboard.nextInt();

        System.out.println("Enter another 6-digit whole number:");
        numberB = keyboard.nextInt();

        if (numberA < MINIMUM || numberB < MINIMUM) {
            System.out.println("One of the numbers is too small.");
        } else if (numberA > MAXIMUM || numberB > MAXIMUM) {

            System.out.println("One of the numbers is too big.");
        } else {
            product = numberA * numberB;
            System.out.println("The product is: " + product);

            lastFiveDigits = (int) (product % 100000);

            if (lastFiveDigits != 0) {
                System.out.println("The 5 final digits are: " + lastFiveDigits);
            } else {
                System.out.println("The 5 final digits are: 00000");
            }

            keyboard.close();

        }


    }
}
