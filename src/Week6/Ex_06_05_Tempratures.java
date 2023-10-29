package Week6;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_06_05_Tempratures {
    public static void main(String[] args) {
        ArrayList<Integer> temprature = new ArrayList<Integer>();
        double[] temperature = new double[7];
        double sum=0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter 7 tempratures:");

        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Day "+(i+1)+":");
            temperature[i]=keyboard.nextInt();
            sum=sum+temperature[i];
        }


        System.out.println("Summary:");
        System.out.println("========================");
        for (int i = 0; i < temperature.length; i++) {
            System.out.printf("Day %d:\t%.1f %n",(i+1),temperature[i]);
        }
        System.out.printf("Average %10.1f",(sum/temperature.length));

    }
}
