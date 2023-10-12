package Week3;

import java.util.Scanner;

public class Ex_03_09_Extra_Interest_Rate {

    public static void main(String[] arg){
        Scanner keyboard = new Scanner(System.in);
        double startingCapital;
        double interesRate;
        int numberOfYears;


        System.out.println("Enter the starting capital in");
        startingCapital= keyboard.nextDouble();

        System.out.println("Enter the interest rate");
        interesRate = keyboard.nextDouble();

        System.out.println("Enter the number of years");
        numberOfYears = keyboard.nextInt();

        System.out.println("The capital will amount to "+ (int)compoundInterest(startingCapital,interesRate,numberOfYears));

    }

    static double compoundInterest(double startingCapital, double interestRate, int numberOfYears){
        return startingCapital * Math.pow((1+interestRate/100),numberOfYears);
    }
}
