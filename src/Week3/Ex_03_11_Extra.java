package Week3;

import java.util.Scanner;

public class Ex_03_11_Extra {
    public static void main(String[] args) {
        Scanner keyboard =new Scanner(System.in);

        int startingValue;
        int increment;
        int number;

        System.out.println("How many numbers do you want to print?");
        number =keyboard.nextInt();
        System.out.println("Starting value:");
        startingValue =keyboard.nextInt();
        System.out.println("increment");
        increment=keyboard.nextInt();

        for (int i = 0; i < number; i++) {
            startingValue +=increment;
            System.out.println(startingValue);
        }


    }
}
