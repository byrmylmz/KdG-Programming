package Solutions.SWeek2.A05_numbers_v3.src.be.kdg.java1;

import java.util.Scanner;

public class Main {
    /*
    Enter a 13-digit whole number: 1234567890123
    Enter an 8-digit whole number: 87654321
    The quotient is 14084.506913504014
    Without the fractional part it's 14084
    */
    /*
    Enter a 13-digit number: 123456789012
    This number is too small.
    */
    /*
    Enter a 13-digit whole number: 1234567890123
    Enter an 8-digit whole number: 1234567
    This number is too small.
    */
    public static void main(String[] args) {
        final long MINIMUM_DIVIDEND = 1000000000000L;
        final long MINIMUM_DIVISOR = 10000000L;
        long dividend, divisor;
        double quotient;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a 13-digit whole number: ");
        dividend = keyboard.nextLong();
        if (dividend < MINIMUM_DIVIDEND) {
            System.out.println("This number is too small.");
        } else {
            System.out.print("Enter an 8-digit whole number: ");
            divisor = keyboard.nextLong();
            if (divisor < MINIMUM_DIVISOR) {
                System.out.println("This number is too small.");
            } else {
                quotient = dividend / (double) divisor;
                System.out.println("The quotient is " + quotient);
                System.out.println("Without the fractional part it's " + (long) quotient);
            }
        }
    }
}
