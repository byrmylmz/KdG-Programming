package Week4;

import java.util.Scanner;

public class Ex_04_09_CounTo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number=0;
        int MAX_NUMBER = 20;
        int MIN_NUMBER = 1;

        boolean keepRun = false;

        StringBuilder sb = new StringBuilder();
        while (!keepRun) {
            System.out.println("Enter the number to count to: ");

            if (keyboard.hasNextInt()) {
                number = keyboard.nextInt();
                if (number >= MIN_NUMBER && number <= MAX_NUMBER) {
                    keepRun = true;
                    sb.append(number);
                } else {
                    System.out.println("The number should be between 1 and 20");
                    keepRun = true;
                }

            } else {
                System.out.println("You didn't enter a number!");
                keyboard.nextLine();

            }

        }
        keyboard.close();

        for (int i = 1; i <= number; i++) {
            sb.append(i);
            sb.append(' ');
        }
        System.out.println(sb);
        System.out.println(sb.toString().replaceAll("\\s",""));

    }


}





