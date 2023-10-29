package Week2;

import java.util.Scanner;

public class Ex_02_08_Digits_v2 {

    public static void main(String[] arg) {
        final int MINIMUM = 1000;
        final int MAXIMUM = 9999;
        int number;
        int input;
        int digitsSum;
        boolean keepRunning =true;

        Scanner key= new Scanner(System.in);
//        System.out.println("Enter a 4-digit whole number (1000..9999):");
//        number = key.nextInt();
//        if(number< MINIMUM || number>MAXIMUM){
//            System.out.println("invalid number");
//        }else{
//            int fourthDigit = number %10;
//            int thirdDigit = ((number %100)-fourthDigit)/10;
//            int secondDigit = ((number%1000)-(number%100))/100;
//            int firstDigit = (number-(number%1000))/1000;
//
//            System.out.println("The sum of the digits of this number is "+(firstDigit+secondDigit+thirdDigit+fourthDigit));
//        }


        while(keepRunning) {
            System.out.print("Enter a 4-digit whole number (1000...9999): ");

            input = key.nextInt();
            digitsSum = 0;


            if (input == -1) {
                keepRunning = false;
            }
            else {


                if (input >= MINIMUM && input <= MAXIMUM) {

                    while(input > 0) {
                        digitsSum += input % 10;
                        input /= 10;
                    }

                    System.out.println("The sum of the digits of this number is " + digitsSum);
                }
                else {
                    System.out.println("The number is either too small or too big. Please enter a new number.");
                }
            }
        }



    }
}
