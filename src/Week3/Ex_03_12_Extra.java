package Week3;

import java.util.Scanner;

public class Ex_03_12_Extra {
    public static void main(String[] args) {
        int number;
        Scanner keyboard =new Scanner(System.in);
        System.out.println("Enter a number between 1 and 30:");
        number = keyboard.nextInt();
        for (int i = 1; i <= number; i++) {
//            System.out.print(i);
            for (int j = 0; j < number; j++) {
                System.out.print(j);
            }

        }

    }
}
