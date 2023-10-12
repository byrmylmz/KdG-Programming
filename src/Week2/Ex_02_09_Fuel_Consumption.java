package Week2;

import java.util.Scanner;

public class Ex_02_09_Fuel_Consumption {

    public static void main(String[] arg){
        Scanner key = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        int previousMileage;
        int drivenMileage;
        double litersRefilled;

        System.out.print("Enter the previous mileage: ");
        previousMileage = sc.nextInt();

        System.out.print("Enter the current mileage: ");
        drivenMileage = sc.nextInt() - previousMileage;

        System.out.print("Enter the amount of liters refilled: ");
        litersRefilled = sc.nextDouble();

        System.out.print("Consumption for " + drivenMileage + "km driven: ");
        System.out.format("%.2f", (1 / ((double)drivenMileage / litersRefilled)) * 100); //TODO bu format olayini tekrar bakacam
        System.out.println(" liters/100km");

        sc.close();


    }
}
