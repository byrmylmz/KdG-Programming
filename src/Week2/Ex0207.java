package Week2;

import java.util.Scanner;

public class Ex0207 {

    public static void main(String[] arg) {

        Scanner keyboard = new Scanner(System.in);
        int result = 0;
        boolean keepRunning = true;
        int firstDigit;

        while (keepRunning) {

            System.out.println("Enter four digits (0..9).");


            System.out.println("The first digit:");
            firstDigit = keyboard.nextInt();

            if (firstDigit != -1) {
                result += (1000 * firstDigit);

                System.out.println("The second digit:");
                result += (100 * keyboard.nextInt());

                System.out.println("The third digit:");
                result += (10 * keyboard.nextInt());

                System.out.println("The fourth digit:");
                result += keyboard.nextInt();

                System.out.println("The number is " + result);

                keepRunning = false;

            } else {
                keepRunning = false;
            }


        }
        keyboard.close();

    }
}
