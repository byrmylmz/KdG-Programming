package Week3;

import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int number = 0;
        int count = 0;
        int start=1;

        while (number < 1000) {
            count++;

            int multiply = a * b;
            System.out.print(number + " " + (count % 10 == 0 ? "\n"   : ""));
            number = multiply * start;
        }
    }
}
