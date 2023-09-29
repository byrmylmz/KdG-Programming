package Week1;

import java.util.Scanner;

public class Ex0109 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int firstNumber,secondNumber,thirdNumber;

        System.out.println("Enter the first number: ");
        firstNumber = keyboard.nextInt();

        System.out.println("Enter the second number: ");
        secondNumber = keyboard.nextInt();

        System.out.println("Enter the third number: ");
        thirdNumber = keyboard.nextInt();

        if(firstNumber>100 ){
            System.out.println("Please enter < 100");
        }

        if(secondNumber>100 ){
            System.out.println("Please enter < 100");
        }

        if(thirdNumber>100 ){
            System.out.println("Please enter < 100");
        }

        System.out.println("The middle number: " + ((firstNumber+secondNumber+thirdNumber) /3));

    }

}
