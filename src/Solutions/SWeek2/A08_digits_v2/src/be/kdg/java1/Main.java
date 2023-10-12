package Solutions.SWeek2.A08_digits_v2.src.be.kdg.java1;

import java.util.Scanner;

public class Main {
    /*
    Enter a 4-digit whole number (1000..9999): 1540
    The sum of the digits of this number is 10
    */
    /*
    Enter a 4-digit whole number (1000..9999): 6187
    The sum of the digits of this number is 22
    */
    public static void main(String[] args) {
        final int MINIMUM = 1000;
        final int MAXIMUM = 9999;
        Scanner keyboard = new Scanner(System.in);
        int number;
        int sum = 0;
        System.out.print("Enter a 4-digit whole number (1000..9999): ");
        number = keyboard.nextInt();
        if (number < MINIMUM || number > MAXIMUM) {
            System.out.println("It should be a 4-digit number!");
        } else {
            sum += number % 10;
            number = number / 10;
            sum += number % 10;
            number = number / 10;
            sum += number % 10;
            number = number / 10;
            sum += number % 10;
            System.out.println("The sum of the digits of this number is " + sum);
        }
    }
}
