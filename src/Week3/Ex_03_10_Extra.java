package Week3;

import java.util.Scanner;

public class Ex_03_10_Extra {
    public static void main(String[] arg) {
        System.out.println("We'll draw an ASCII box using a character and dimensions of your choice.");

        Scanner keyboard = new Scanner(System.in);

        // Strings
        char ch;
        int width;
        int height;
        boolean inputError;


        System.out.println("Enter a character:");
        ch = keyboard.nextLine().charAt(0);

        do {
            System.out.println("Enter the width (2..60):");
            width = keyboard.nextInt();

            // do it with do while
            if (width > 30 || width < 2) {
                System.out.println("invalid Width");
                inputError = true;
            } else {
                inputError = false;
            }

        } while (inputError);
        do {
            System.out.println("Enter the height (2..20):");
            height = keyboard.nextInt();

            // do it width do while
            if (height > 20 || height < 2) {
                System.out.println("Invalid Height");
                inputError = true;
            } else {
                inputError = false;
            }

        } while (inputError);

//        task_1(ch, width, height);
        task_2(ch, width, height);


    }

    static void task_1(char ch, int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(ch + (j == width - 1 ? "\n" : ""));
            }
        }
    }


    static void task_2(char ch, int width, int height) {
        for (int i = 0; i < height; i++) {
            System.out.print(ch);
            for (int j = 0; j < width; j++) {
                System.out.print((i == 0 || i == height - 1) ? ch : " ");
            }
            System.out.print(ch + "\n");
        }
    }
}
