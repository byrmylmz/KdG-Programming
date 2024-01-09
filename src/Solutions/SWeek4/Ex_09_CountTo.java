package Solutions.SWeek4;

import java.util.Scanner;

public class Ex_09_CountTo {
    public static void main(String[] args) {
        final int MIN = 1, MAX = 20;
        int input = 0;
        boolean success = false;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(!success) {
            System.out.print("Enter the number to count to: ");

            if (sc.hasNextInt()) {
                input = sc.nextInt();
                if (MIN <= input && input <= MAX) {
                    success = true;
                } else {
                    System.out.println("The number should be between 1 and 20.");
                }
            } else {
                System.out.println("You didn't enter a number!");
                sc.nextLine(); // Clearing input buffer
            }
        }

        sc.close();

        for (int i = 1; i <= input; i++) {
            sb.append(i);
            sb.append(' ');
        }

        System.out.println(sb);
        System.out.println(sb.toString().replaceAll("\\s", ""));
    }

}
