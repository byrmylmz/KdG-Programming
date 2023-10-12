package Solutions.SWeek2.A04_numbers_v2.src.be.kdg.java1;

import java.util.Scanner;

public class Main {
    /*
    Enter a 6-digit whole number: 123456
    Enter another 6-digit whole number: 654321
    The product is 80779853376
    The 5 final digits are: 53376
    */
    /*
    Enter a 6-digit whole number: 12345
    Enter another 6-digit whole number: 123456
    One of the numbers is too small.
    */
    public static void main(String[] args) {
        final int MINIMUM = 100000;
        final int MAXIMUM = 999999;
        long number1, number2;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a 6-digit whole number: ");
        number1 = keyboard.nextInt();
        System.out.print("Enter another 6-digit whole number: ");
        number2 = keyboard.nextInt();
        if (number1 > MAXIMUM || number2 > MAXIMUM) {
            System.out.println("One of the numbers is too large.");
        } else if (number1 < MINIMUM || number2 < MINIMUM) {
            System.out.println("One of the numbers is too small.");
        } else {
            long product = number1 * number2;
            System.out.println("The product is " + product);
            System.out.println("The 5 final digits are: " + product % MINIMUM);
        }
    }
}
