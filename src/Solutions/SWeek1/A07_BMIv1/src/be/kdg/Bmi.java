package Solutions.SWeek1.A07_BMIv1.src.be.kdg;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        //declarations:
        Scanner keyboard = new Scanner(System.in);
        int weight;
        double length;
        double bmi;

        //input:
        System.out.println("Dear patient, this programma will calculate your BMI.");
        System.out.print("Enter your weight in kilograms: ");
        weight = keyboard.nextInt();
        System.out.print("Enter your length in meters: ");
        length = keyboard.nextDouble();
        //calculate and display:
        bmi = weight / (length * length);
        System.out.println("Your BMI is: " + bmi);
    }
}
