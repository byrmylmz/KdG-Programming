package Solutions.SWeek2.A09_fuel_consumption.src.be.kdg.java1;

import java.util.Scanner;

public class Main {
    /*
    Enter the previous mileage: 79114
    Enter the current mileage: 80103
    Enter the amount of liters refilled: 60.4
    Comsumption for 989km driven: 6.11 liters/100km
    */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int currentMileage, previousMileage, distance;
        double numberOfLiters, consumption;

        System.out.print("Enter the previous mileage: ");
        previousMileage = keyboard.nextInt();
        System.out.print("Enter the current mileage: ");
        currentMileage = keyboard.nextInt();
        System.out.print("Enter the amount of liters refilled: ");
        distance = currentMileage - previousMileage;
        numberOfLiters = keyboard.nextDouble();
        consumption = numberOfLiters * 100 / distance;
        System.out.printf("Comsumption for %dkm driven: %.2f liters/100km", distance, consumption);
    }
}
