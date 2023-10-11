// https://canvas.kdg.be/courses/42650/pages/ex-03-dot-08-divisible-loops-slash-nested-if?module_item_id=823872
package Week3;

import java.util.Scanner;

public class Ex_03_08 {
    public static void main(String[] arg) {
        int firstDivider;
        int secondDivider;
        boolean check = true;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the first divider:");
        firstDivider = keyboard.nextInt();
        if (firstDivider == 0) {
            check = false;
        } ;
        System.out.println("Enter the second divider:");
        secondDivider = keyboard.nextInt();

        int multiple = firstDivider * secondDivider;
        int number = 0;
        int i = 1;
        int counter = 0;

        if (firstDivider < 0 && secondDivider < 0) {
            System.out.println("error: you can ot use number lower than 0");

            while (check) {
            }
            do {
                number = multiple * i;
                i++;
                counter++;
                if (number > 1000) {
                    continue;
                }
                System.out.print(number + " " + (counter % 10 == 0 ? "\n " : ""));
            } while (number < 1000);

        }

    }
}
