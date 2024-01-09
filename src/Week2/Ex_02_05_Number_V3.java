package Week2;

import java.util.Scanner;

public class Ex_02_05_Number_V3 {
    public static void main(String[] arg) {
        final long MINIMUM_DIVIDEND = 1_000_000_000_000L;
        final long MINIMUM_DIVISOR = 10_000_000;



        long dividend;
        long divisor;
        double quotient;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a 13-digit whole number:");
        dividend = keyboard.nextLong();
        if (dividend < MINIMUM_DIVIDEND) {
            System.out.println("This number is too small.");
            return;
        }
        System.out.println("Enter an 8-digit whole number:");
        divisor = keyboard.nextLong();

        if (divisor <= MINIMUM_DIVISOR) {
            System.out.println("This number is too small.");
        } else {
            quotient = (double) dividend / divisor;
            System.out.println(quotient);

            System.out.println("Without the fractional part it's" + (long) quotient);
        }


    }


}
