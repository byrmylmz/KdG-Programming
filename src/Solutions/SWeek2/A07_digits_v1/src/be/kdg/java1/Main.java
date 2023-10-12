package Solutions.SWeek2.A07_digits_v1.src.be.kdg.java1;

import java.util.Scanner;

public class Main {
    /*
    Enter four digits (0..9).
    The first digit: 9
    The second digit: 5
    The third digit: 7
    The fourth digit: 9
    The number is 9579
    */
    /*
    Enter four digits (0..9).
    The first digit: 6
    The second digit: 0
    The third digit: 2
    The fourth digit: 7
    The number is 6027
    */
    /*
    Enter four digits (0..9).
    The first digit: 0
    The second digit: 8
    The third digit: 0
    The fourth digit: 7
    The number is 807
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int d1, d2, d3, d4, number;
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Enter four digits (0..9).");
            System.out.print("The first digit: ");
            d1 = keyboard.nextInt();
            if (d1 == -1) {
                shouldContinue = false;
            } else {
                System.out.print("The second digit: ");
                d2 = keyboard.nextInt();
                System.out.print("The third digit: ");
                d3 = keyboard.nextInt();
                System.out.print("The fourth digit: ");
                d4 = keyboard.nextInt();
                if (d1 < 0 || d2 < 0 || d3 < 0 || d4 < 0 || d1 > 9 || d2 > 9 || d3 > 9 || d4 > 9) {
                    System.out.println("Make sure each digit lies in the range [0-9]!");
                } else {
                    number = d1 * 1000 + d2 * 100 + d3 * 10 + d4;
                    System.out.println("The number is " + number);
                }
            }
        }
    }
}
