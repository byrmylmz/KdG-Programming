package Solutions.SWeek2.A06_ASCII_table.src.be.kdg.java1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a number between 32 and 128");
        int number = keyboard.nextInt();

        if(number<=32 || number>128){
            System.out.println("Invalid number!");
            return;
        }

        System.out.println("Your characters is: " + (char)number);


        //Advanded
        for (char c = 32; c < 128; c++) {
            //printf(ormat) is a fancy, quick way of printing things smoothly. We will learn this later.
            System.out.printf("    %c (%3d)", c, (int) c);

            if (c % 6 == 1) {
                System.out.println();
            }
        }
    }
}
