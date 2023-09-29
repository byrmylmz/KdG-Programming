package Week1;

import java.util.Scanner;

public class Ex0105 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num1 = sc.nextInt();

        System.out.println("Enter another number: ");
        num2 = sc.nextInt();

        System.out.println("Enter a final number: ");
        num3 = sc.nextInt();

        System.out.println("The product is: " + (num1 * num2 * num3));

        sc.close();
    }


}


