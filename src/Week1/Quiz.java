package Week1;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int result = 1000;

        System.out.println("Please guess the number: ");

        int number = keyboard.nextInt();

        if (number < result) {
            System.out.println("The number you guessed is too low.");
        }
        if (number > result) {
            System.out.println("The number you guessed is too high.");
        }
        if (number == result) {
            System.out.println("Tyou guessed correct");
        }

        keyboard.close();

    }
}
